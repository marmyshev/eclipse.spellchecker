# edt.spellchecker
1C:EDT Spelling service plugin

## Eclipse extension plugin for [1C:Enterprise Development Tools](http://1c-dn.com/1c_enterprise/1c_enterprise_developmet_tools_graphite/)

Still under construction.

## Installation

### Necessary components

1. 1C:Enterprise Development Tools version 1.4.0 (http://1c-dn.com/1c_enterprise/1c_enterprise_developmet_tools_graphite/)
2. Eclipse Mars2 (4.5.2) for RCP and RAP Developers (http://www.eclipse.org/downloads/packages/eclipse-rcp-and-rap-developers/mars2)
3. Java SE Development Kit 8u111 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

### Build with Maven


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
