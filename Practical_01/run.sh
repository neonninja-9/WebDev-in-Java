#!/bin/bash
set -e

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$DIR"

JAVA="/home/neonninja09/.gradle/jdks/eclipse_adoptium-21-amd64-linux.2/bin/java"
JAVAC="/home/neonninja09/.gradle/jdks/eclipse_adoptium-21-amd64-linux.2/bin/javac"
JAR="/home/neonninja09/.gradle/jdks/eclipse_adoptium-21-amd64-linux.2/bin/jar"
SERVLET_JAR="/home/neonninja09/.m2/repository/jakarta/servlet/jakarta.servlet-api/6.0.0/jakarta.servlet-api-6.0.0.jar"
TOMCAT_LIBS="/usr/share/tomcat/lib/*"

echo "=== Building Practical 01 ==="
mkdir -p target/classes target/lab/WEB-INF/classes

# Compile Servlet
$JAVAC -cp "$SERVLET_JAR" -d target/classes src/main/java/com/example/HttpDemoServlet.java

# Prepare webapp directory & WAR
cp -r target/classes/com target/lab/WEB-INF/classes/
cp -r src/main/webapp/* target/lab/
(cd target/lab && $JAR -cf ../lab.war *)

# Compile Tomcat Runner
$JAVAC -cp "$TOMCAT_LIBS" -d target/classes target/EmbeddedTomcat.java

echo "=== Starting Tomcat Server ==="
exec $JAVA -cp "target/classes:$TOMCAT_LIBS" EmbeddedTomcat
