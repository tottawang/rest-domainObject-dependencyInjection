# rest-domainObject-dependencyInjection

### Run and build
Step-1: 
./gradlew clean build

Step-2:
java -javaagent:lib/spring-instrument-4.2.4.RELEASE.jar -jar build/libs/sample-0.0.1-SNAPSHOT.jar

Step-3:
curl http://localhost:{your_server_port}/api/domain-obj-di

### Discussions
It's verbose that we have to start java agent with library spring-instrument
For more information please see https://github.com/spring-projects/spring-boot/issues/739

