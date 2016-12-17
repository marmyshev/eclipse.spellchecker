# edt.spellchecker [![Build Status](https://travis-ci.org/marmyshev/edt.spellchecker.svg?branch=master)](https://travis-ci.org/marmyshev/edt.spellchecker)
1C:EDT Spelling service plugin

## Eclipse extension plugin for [1C:Enterprise Development Tools](http://1c-dn.com/1c_enterprise/1c_enterprise_developmet_tools_graphite/)

Still under construction.

## Installation

Add Eclipse Update Site to your 1C:EDT installation: [https://marmyshev.github.io/updates/edt/edt.spellchecker](https://marmyshev.github.io/updates/edt/edt.spellchecker)

### Necessary components

1. 1C:Enterprise Development Tools version 1.4.0 (http://1c-dn.com/1c_enterprise/1c_enterprise_developmet_tools_graphite/)
2. Eclipse Mars2 (4.5.2) for RCP and RAP Developers (http://www.eclipse.org/downloads/packages/eclipse-rcp-and-rap-developers/mars2)
3. Java SE Development Kit 8u111 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

### Build with Maven

Before all, you need to install Maven form (https://maven.apache.org/download.cgi) with instructions (https://maven.apache.org/install.html) and set encrypted info for user of (https://partners.v8.1c.ru) in settings.xml [follow here to get example](https://github.com/1C-Company/dt-example-plugins/tree/master/simple-plugin).

1. Open console in plugin directory
2. Execute command:
```
mvn clean verify -f build/pom.xml
```
3. Compiled p2 repository is in plugin subfolder:
```
/..PathToPluginDirectory../repository/target/repository/
```

## Usage

Start [1C:Enterprise Development Tools](http://1c-dn.com/1c_enterprise/1c_enterprise_developmet_tools_graphite/).
