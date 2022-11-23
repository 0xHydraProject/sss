import sbt._

object Dependencies {

  //console
  val jline = "org.jline" % "jline" % "3.21.0"

  //cats
  val cats = "org.typelevel" %% "cats-effect" % "3.4.1"

  //test
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.14" % "test"
  val mockito = "org.scalatestplus" %% "mockito-3-4" % "3.2.10.0" % "test"
}