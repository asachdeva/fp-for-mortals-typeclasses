name := "fp-for-mortals-typeclasses"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.lihaoyi" % "ammonite" % "1.8.2" cross CrossVersion.full,
  "org.typelevel" %% "cats-core" % "2.0.0"
)

mainClass := Some("com.ovoenergy.service.Ammonite")

showSuccess := false

logLevel in run := Level.Warn
