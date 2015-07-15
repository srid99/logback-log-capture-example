name := "logback-log-capture-example"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.2"
  , "junit" % "junit" % "4.11" % "test"
  , "org.specs2" %% "specs2-core" % "3.6.2" % "test"
  , "org.specs2" %% "specs2-junit" % "3.6.2" % "test"
)
