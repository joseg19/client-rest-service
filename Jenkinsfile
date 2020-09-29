pipeline {
  agent any
  tools {
    maven 'Maven 3.3.9'
    jdk 'jdk8'
  }
  stages {
    stage('Clone sources') {
      steps {
        git 'https://github.com/joseg19/client-rest-service.git'
      }
    }
    stage('Maven Build') {
      steps {
        sh 'sh mvn clean install'
      }
    }
    stage('Building image') {
      steps {
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }

    stage('Deploy Image') {
      steps {
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }

      }
    }

    stage('Remove Unused docker image') {
      steps {
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }

  }
  environment {
    registry = 'gcr.io/big-project-cl-2020'
    registryCredential = 'gcp'
    dockerImage = ''
  }
}