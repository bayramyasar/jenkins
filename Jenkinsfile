#!/usr/bin/env groovy

pipeline {
	agent any

	tools {
		jdk 'java-17'
	}

	stages {

		stage('Build'){
			steps {
				bat "echo Building"
				bat "./mvnw.cmd clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "echo Testing"
				bat "./mvnw.cmd test"
			}
		}

		stage('Deploy') {
			steps {
				bat "echo Deploy"
				bat "java -jar target/dof-jenkins-0.0.1-SNAPSHOT.jar"
			}
		}
	}
}

//pipeline {
//	agent any
//
//	environment {
//		mavenHome = tool 'jenkins-maven'
//	}
//
//	tools {
//		jdk 'java-17'
//	}
//
//	stages {
//
//		stage('Build'){
//			steps {
//				bat "echo Building"
//				bat "mvn clean install -DskipTests"
//			}
//		}
//
//		stage('Test'){
//			steps{
//			    bat "echo Testing"
//				bat "mvn test"
//			}
//		}
//
//		stage('Deploy') {
//			steps {
//			    bat "echo Deploy"
//			    //sh "nohup java -jar target/dof-jenkins-0.0.1-SNAPSHOT.jar &"
//				//sh "nohup mvn spring-boot:run &" 	// did not work
//				//sh "systemctl start spring-app"
//			}
//		}
//	}
//
//	post {
//		success {
//			sh "nohup java -jar target/dof-jenkins-0.0.1-SNAPSHOT.jar"
//			//sh "cp target/dof-jenkins-0.0.1-SNAPSHOT.jar /var/spring-application/dof.jar"
//		}
//		failure {
//			echo "build failure"
//		}
//	}
//}