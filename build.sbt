import AssemblyKeys._

name := "hbase-rdd-examples"

version := "0.7.1"

scalaVersion := "2.10.6"

assemblySettings

assemblyOption in assembly ~= { _.copy(includeScala = false) }

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:postfixOps"
)

resolvers ++= Seq(
  "Hadoop Releases" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
  "Artima Maven Repository" at "http://repo.artima.com/releases",
  "apester" at "https://github.com/Qmerce/events-model.git#master",
  "shushu" at "https://github.com/shushu/hbase-rdd.git#master"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.0",
  "org.apache.spark" %% "spark-streaming" % "1.6.0" ,
  "org.apache.hbase" % "hbase-client" % "1.1.2" ,
  "org.apache.hbase" % "hbase-server" % "1.1.2",
  "org.apache.hbase" % "hbase-common" % "1.1.2" ,
  "eu.unicredit" %% "hbase-rdd" % "0.7.1"
)
