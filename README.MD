###Cat Downloader - Download cat pictures easily.


Make sure you have installed JDK 11 before building. Higher or lower versions won't work.<br/>
Git is also required. <br/>
(i know the program is slow, maybe i'll try to make it faster in the future.)

Build and run instructions for Linux and MacOS: 
```shell
#Git clone the repo
git clone https://github.com/bartosz11/cat-pic-downloader.git
#Change directory
cd cat-pic-downloader
#Give permissions to ./gradlew
chmod +x ./gradlew
#Run gradle build
./gradlew shadowJar
#Change directory
cd /build/libs/
#Run 
java -jar CatPicDownloaderV2-1.0-all.jar
```
Build and run instructions for Windows: (Run all commands from Git Bash!)
```shell
#Git clone the repo
git clone https://github.com/bartosz11/cat-pic-downloader.git
#Change directory
cd cat-pic-downloader
#Run gradle build
./gradlew shadowJar
#Change directory
cd /build/libs/
#Run 
java -jar CatPicDownloaderV2-1.0-all.jar
```
