pipeline {
    agent any
    tools {
    maven 'M3'
  }
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
