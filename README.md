# Shared module to recognize code in jvm lib jar 

Clone test project and generate jars in lib directories on JS and JVM platforms:

    git clone https://github.com/marcgrue/shared-recogn-jvm-lib.git
    cd shared-recogn-jvm-lib
    sbt compile -Dmolecule=true

Open in Intellij. Notice the difference between JvmTest and SharedTest (see comments in code). 
    
    