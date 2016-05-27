


lazy val commonSettings = Seq(
  name := "graphX",
    version := "1.0",
scalaVersion := "2.10.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "graph",
    mainClass in assembly := Some("start.start"),
    assemblyJarName in assembly := "graph.jar",

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.5.2" % "provided",
  "org.apache.spark" % "spark-graphx_2.10" % "1.5.2" % "provided",
  "org.apache.spark" %% "spark-hive" % "1.5.2" % "provided")
)

unmanagedBase <<= baseDirectory { base => base / "project/lib" }