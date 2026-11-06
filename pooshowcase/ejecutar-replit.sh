#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")"
mkdir -p target/classes
find src/main/java -name '*.java' -print > target/fuentes.txt
javac --release 17 -encoding UTF-8 -d target/classes @target/fuentes.txt
cp -R src/main/resources/. target/classes/
exec java -cp target/classes com.cerp.Main --consola
