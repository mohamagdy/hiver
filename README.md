# Hiver

To run the application please follow the following steps:

1. install `sbt` version 0.13.6+ http://www.scala-sbt.org/download.html
2. Run `sbt assembly` in the root path of the project, this command will generate a Jar file in the path `$PROJECT_HOME/target/scala-2.10`
3. Submit the Jar file to Spark with the following command `spark-submit --name hiver --deploy-mode client --class com.fyber.Main <path-to-jar-file>`
