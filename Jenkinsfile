pipeline {
  agent any

  stages {
    stage('Clone sources') {
        git url: 'https://github.com/joseg19/client-rest-service.git'
    }
    /*stage("Build") {
      steps {
        sh 'mvn clean install'
      }
    }

    stage("Testing") {
      parallel {
        stage("Unit Tests") {
          agent { docker 'openjdk:7-jdk-alpine' }
          steps {
            sh 'java -version'
          }
        }
        stage("Functional Tests") {
          agent { docker 'openjdk:8-jdk-alpine' }
          steps {
            sh 'java -version'
          }
        }
        stage("Integration Tests") {
          steps {
            sh 'java -version'
          }
        }
      }
    }

    stage("Deploy") {
      steps {
        echo "Deploy!"
      }
    }*/
  }
}