organization := "com.lightbend.alpakka.samples"
name := "alpakka-samples-sqs-java"

ThisBuild / scalaVersion := "2.13.7"

val AkkaVersion = "2.7.0"
val AlpakkaVersion = "5.0.0"
val AkkaDiagnosticsVersion = "2.0.0-M3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.lightbend.akka" %% "akka-stream-alpakka-sqs" % AlpakkaVersion,
  "com.lightbend.akka" %% "akka-diagnostics" % AkkaDiagnosticsVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
)

licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))

javacOptions ++= Seq(
  "-Xlint:deprecation"
)
