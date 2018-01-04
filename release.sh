#!/usr/bin/env bash

rm -rf $HOME/.gradle/caches
rm -rf .gradle

./gradlew clean build bintrayUpload