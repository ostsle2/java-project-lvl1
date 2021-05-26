install: # очистить результаты предыдущей сборки и запустить новую.
	./gradlew clean install
run-dist: # запуск исполняемого файла
	./build/install/app/bin/app
check-updates:
	./gradlew dependencyUpdates

