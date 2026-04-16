pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: https://github.com/Niranjan20042005/AnagramProject.git
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('MySonar') {
                    sh '''
                    mvn sonar:sonar \
                    -Dsonar.projectKey=AnagramProject \
                    -Dsonar.projectName=AnagramProject
                    '''
                }
            }
        }
    }
}