name := "httpize"

version := "0.1.0"

organization := "org.purang.net"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-core" % "0.2.0-SNAPSHOT",
  "org.http4s" %% "http4s-dsl" % "0.2.0-SNAPSHOT",
  "org.http4s" %% "http4s-blaze" % "0.2.0-SNAPSHOT",
  "io.argonaut" %% "argonaut" % "6.0.4",
  "org.scalaz" %% "scalaz-core" % "7.0.6"  withSources(),
  "org.scalaz" %% "scalaz-concurrent" % "7.0.6"  withSources(),
  "org.scalacheck" %% "scalacheck" % "1.11.4" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
  )

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-feature", "-unchecked", "-language:_", "-optimize", "-Yinline", "-Yinline-warnings" , "-Ywarn-all")

Revolver.settings

seq(com.typesafe.sbt.SbtStartScript.startScriptForClassesSettings: _*)

cancelable := true

fork := true

logBuffered := false

//seq(bintrayPublishSettings:_*)

licenses += ("BSD", url("http://www.tldrlegal.com/license/bsd-3-clause-license-%28revised%29"))