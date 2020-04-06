name := "scalabot"

version := "1.0-kerala"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "info.mukel" %% "telegrambot4s" % "3.0.14"
)

enablePlugins(JavaAppPackaging)
