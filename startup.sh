#!/bin/bash

set -ex

# bash array
ARGS=()

DB_URL="jdbc:postgresql://${POSTGRES_HOST}:${POSTGRES_PORT}/${POSTGRES_DB}?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"

ARGS+=(-Dspring.datasource.url="${DB_URL}" -Dspring.datasource.username="${POSTGRES_USER}" -Dspring.datasource.password="${POSTGRES_PASSWORD}")

if [ -z "$JVM_MEMORY_OPTS" ]; then
    # JVM_MEMORY_OPTS="-XX:+PrintFlagsFinal -XX:+PrintGCDetails"
    JVM_MEMORY_OPTS="-Xms300m -Xmx300m -Xss256k -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m"
    echo "JVM memory options set to DEFAULT"
fi
echo "JVM memory options set to: ${JVM_MEMORY_OPTS}"
ARGS+=(${JVM_MEMORY_OPTS})

java "${ARGS[@]}" -jar app.jar
