name := "taxero"
organization := "org.clulab"

libraryDependencies ++= Seq(
  "org.clulab" %% "processors-main" % "7.4.4",
  "ai.lum" %% "odinson-core" % "0.2.0-SNAPSHOT",
  "ai.lum" %% "common" % "0.0.9",
)

lazy val core = project in file(".")

lazy val webapp = project
  .enablePlugins(PlayScala)
  .aggregate(core)
  .dependsOn(core)
