lazy val sparkVersion = "2.1.0"
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "timeusage",
      scalaVersion := "2.11.8",
      version      := "1.0"
    )),
    name := "timeusage-spark",
    libraryDependencies ++= Seq(
		"org.apache.spark" %% "spark-core" % sparkVersion,
		"org.apache.spark" %% "spark-sql" % sparkVersion,
		"org.scalatest" %% "scalatest" % "3.0.1"
	)
  )
