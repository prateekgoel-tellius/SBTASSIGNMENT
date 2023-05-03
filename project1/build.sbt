name := "project1"
version := "1.6.1"
scalaVersion := "2.12.11"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.0"
mainClass in (Compile, run) := Some("Main")