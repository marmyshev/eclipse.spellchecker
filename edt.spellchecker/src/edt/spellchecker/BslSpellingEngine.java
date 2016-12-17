/**
 * Copyright (C) 2016, 1C
 */
package edt.spellchecker;

import org.eclipse.core.runtime.AssertionFailedException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector;

import edt.spellchecker.engine.ISpellChecker;
import edt.spellchecker.etc.PreferenceConstants;

/**
 * @author marmyshev_d
 *
 */
public class BslSpellingEngine
    extends SpellingEngine
{

    @Override
    protected void check(IDocument document, IRegion[] regions, ISpellChecker checker,
        ISpellingProblemCollector collector, IProgressMonitor monitor)
    {

        SpellingEngine.SpellEventListener listener = new SpellingEngine.SpellEventListener(collector, document);
        boolean isIgnoringBslStrings =
            PreferenceConstants.getPreferenceStore().getBoolean(PreferenceConstants.SPELLING_IGNORE_BSL_STRINGS);

        try
        {
            for (int i = 0; i < regions.length; ++i)
            {
                IRegion region = regions[i];
                ITypedRegion[] partitions = TextUtilities.computePartitioning(document, "___java_partitioning",
                    region.getOffset(), region.getLength(), false);
                for (int index = 0; index < partitions.length; ++index)
                {
                    if ((monitor != null) && (monitor.isCanceled()))
                    {
                        return;
                    }
                    if (listener.isProblemsThresholdReached())
                    {
                        return;
                    }
                    ITypedRegion partition = partitions[index];
                    String type = partition.getType();

                    if ((isIgnoringBslStrings) && (type.equals("__java_string")))
                    {
                        continue;
                    }
                    if ((!(type.equals("__dftl_partition_content_type"))) && (!(type.equals("__java_character"))))
                    {
                        checker.execute(listener, new SpellCheckIterator(document, partition, checker.getLocale()));
                    }
                }
            }
        }
        catch (BadLocationException localBadLocationException)
        {
        }
        catch (AssertionFailedException localAssertionFailedException)
        {
        }

    }

}
