name := "ParfaitExperiment1"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

//scalacOptions += "-deprecation"

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("mvb.wip.parfait1.SystemApp")


//libraryDependencies += "junit" % "junit" % "4.5" % "test"


libraryDependencies ++= {
  val akkaVersion  = "2.3.5"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
  )
}

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)
