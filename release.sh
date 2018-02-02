#!/usr/bin/env bash

#rm -rf $HOME/.gradle/caches
#rm -rf .gradle

echo "开始编译 上传到jcenter"
./gradlew clean build bintrayUpload

#./gradlew clean build -P bintrayUsername=soli -P bintrayApiKey=ebaf0660d0f7ae6f270c9d229510e440d958a26b bintrayUpload

#./gradlew -P repositoryUrl=file://C://Users/Soli/.m2/repository uploadArchives

#./gradlew -P repositoryUrl=file://D://AndroidStudio/sdk/extras/taihe/m2repository/ uploadArchives