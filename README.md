# rest-domainObject-dependencyInjection

### Run and build
Step-1: 
./gradlew clean build

Step-2:
java -javaagent:lib/spring-instrument-4.2.4.RELEASE.jar -jar build/libs/sample-0.0.1-SNAPSHOT.jar

Step-3:
curl http://localhost:{your_server_port}/api/domain-obj-di

### Issues
Issue 1: must start java agent explicitly
It's verbose that we have to start java agent with library spring-instrument
For more information, please see https://github.com/spring-projects/spring-boot/issues/739

Issue 2: performance overhead
Constructing 10k domain objects marked as Configurable with new operator takes around 2500ms in my machine, but it only takes 1ms to construct 10k same domain objects without Configurable.

Following link concludes that performance overhead is negligible, but looks my environment doesn't look like same. http://www.nurkiewicz.com/2009/10/yesterday-i-had-pleasure-to-participate.html
