pipeline {
  agent any
  stages {
    stage('Clone sources') {
      steps {
        git 'https://github.com/joseg19/client-rest-service.git'
      }
    }

    stage('Maven Build') {
      steps {
        sh 'mvn clean install'
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
  tools {
    maven 'mvn'
  }
  environment {
    registry = 'gcr.io/big-project-cl-2020'
    registryCredential = 'gcr'
    dockerImage = ''
  }
}