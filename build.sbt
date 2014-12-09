organization  := "com.xebia"

name := "reactive-stream-exploration"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"

val akkaVersion = "2.3.6"

libraryDependencies ++= Seq(
    "com.typesafe.akka"       %% "akka-actor"                     % akkaVersion,
    "com.typesafe.akka"       %% "akka-slf4j"                     % akkaVersion,
    "com.typesafe.akka" 	     %% "akka-persistence-experimental"  % akkaVersion,
     "com.typesafe.akka"		 %% "akka-stream-experimental" 		 % "0.11" withSources(),
    "com.typesafe.akka"       %% "akka-cluster"                   % akkaVersion,
    "com.typesafe.akka"       %% "akka-contrib"                   % akkaVersion,
    "io.spray"                %% "spray-can"                      % sprayVersion,
    "io.spray"                %% "spray-client"                   % sprayVersion,
    "io.spray"                %% "spray-routing"                  % sprayVersion,
    "io.spray"                %% "spray-json"                     % "1.3.1",
    "ch.qos.logback"          %  "logback-classic"                % "1.1.2",
    "com.typesafe.akka"       %% "akka-testkit"                   % akkaVersion    % "test",
    "io.spray"                %% "spray-testkit"                  % sprayVersion   % "test",
    "org.scalatest"           %% "scalatest"                      % "2.2.2"        % "test",
    "commons-io"              %  "commons-io"                     % "2.4"          % "test"
	 "joda-time" % "joda-time" % "2.5",
  	"org.joda" % "joda-convert" % "1.7"
)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true
