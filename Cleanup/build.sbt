import com.amazonaws.auth.EnvironmentVariableCredentialsProvider
import com.amazonaws.auth.profile.ProfileCredentialsProvider

name := "java-cleanup"
organization := "ch.claude_martin"

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines")

crossPaths := false
autoScalaLibrary := false

libraryDependencies ++= Seq(
  // == JAVA ==
  "ch.qos.logback"              %  "logback-classic"                % "1.1.3",
  "commons-codec"               %  "commons-codec"                  % "1.10"
)

