val sparkVersion = "1.6.0-cdh5.9.0"

lazy val hiver = (project in file(".")).
  settings(
    version := "0.1-SNAPSHOT",
    organization := "com.example",
    scalaVersion := "2.10.6",
    mainClass in assembly := Some("com.fyber.Main")
  ).
  settings(
    resolvers ++= Seq(
      "Cloudera" at "https://repository.cloudera.com/content/repositories/releases/",
      "Cloudera Artifactory" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
    )
  ).
  settings(
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
      "org.apache.spark" %% "spark-hive" % sparkVersion % "provided"
    )
  )