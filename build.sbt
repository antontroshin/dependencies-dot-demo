import sbt.Defaults.sbtPluginExtra
import sbt.librarymanagement.ModuleID

name := "dependencies-mess-demo"

version := "0.1"

scalaVersion := "2.12.13"

lazy val service1 = (project in file("services/service1")).dependsOn(api1)

lazy val service2 = (project in file("services/service2"))

lazy val api1 = (project in file("api/api1")).dependsOn(api2 % Test, api3)

lazy val api2 = (project in file("api/api2")).dependsOn(service2, api5)

lazy val api3 = (project in file("api/api3")).dependsOn(api4)

lazy val api4 = (project in file("api/api4"))

lazy val api5 = (project in file("api/api5"))