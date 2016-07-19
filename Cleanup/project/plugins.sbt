// Release support (FOR ARTIFACT PROJECTS ONLY)
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")

// This one will give us a way to get to Amazon S3 where we're hosting our Maven repo
resolvers += "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com"
addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.14.0")

