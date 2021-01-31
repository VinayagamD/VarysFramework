name := "varys_framework"

ThisBuild / organization := "com.sadhiya.vays"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.4"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" %"2.6.12"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.6.12"
libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.0"
// https://mvnrepository.com/artifact/com.google.guava/guava
libraryDependencies += "com.google.guava" % "guava" % "30.1-jre"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
// https://mvnrepository.com/artifact/org.eclipse.jetty/jetty-server
libraryDependencies += "org.eclipse.jetty" % "jetty-server" % "11.0.0"


