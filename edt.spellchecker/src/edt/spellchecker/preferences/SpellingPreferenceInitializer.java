package edt.spellchecker.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import edt.spellchecker.etc.PreferenceConstants;

public class SpellingPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PreferenceConstants.getPreferenceStore();

		PreferenceConstants.initializeDefaultValues(store);
	}

}
