import Dependencies._

ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "sss",
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= List(
      jline,
      cats,
      //Test
      scalaTest,
      mockito
    )
  )
