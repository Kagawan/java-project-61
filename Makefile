DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 8.5

clean:
	./gradlew clean

build:
	cd app && ./gradlew clean build

install:
	./gradlew installDist
run-dist:
	./java-project/app/build/install/app/bin/app
run:
	./gradlew run

test:
	./gradlew test

report:
	cd app/ && ./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain

check-deps:
	./gradlew dependencyUpdates -Drevision=release


build-run: build run

.PHONY: build
