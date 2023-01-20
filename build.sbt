ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.13"

lazy val root = (project in file("."))
  .settings(
    name := "sttp client3 test",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.client3" %% "core" % "3.8.8"
    )
  )
