
lazy val app = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    name := "shared-recogn-jvm-lib",
    scalaVersion := "2.13.8",
    version := "0.1-SNAPSHOT",
    resolvers += "clojars" at "https://clojars.org/repo",
    libraryDependencies ++= Seq(
      "org.scalamolecule" %%% "molecule" % "1.1.0",
    ),

    // Let IDE detect created jars in unmanaged lib directory
    exportJars := true
  )

