addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")

libraryDependencies += {
  "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
}

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
