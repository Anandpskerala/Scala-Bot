name := "scalabot"

version := "1.0-kerala"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.bot4s" %% "telegram-core" % "4.0.0-RC2"
)

enablePlugins(JavaAppPackaging)
