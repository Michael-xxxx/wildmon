
WildMon is Licensed under the Apache License, Version 2.0

#Installation:

0. Setup JAVA_HOME to point to JDK 1.7 installation (lightfish uses JDK 1.7 features)
1. `git clone https://github.com/Michael3975798347/wildmon.git`
2. Perform `mvn clean install`in lightfish folder

Drop the lightfish/target/lightfish4wildfly.war into /wildfly-x.x.x/standalone/deployments

add a management user:  
wildfly-x.x.x\bin\add-user.bat


Point your browser to: http://localhost:8080/lightfish4wildfly

Go to Configuration --> Authentification set username/password of the management user  
after button store clicked you will see the server version information  
Run under Actions: Timer start  
Call link: References HTML5  

Tested with Wildfly-8.2.0.Final and Wildfly-9.0.2Final

