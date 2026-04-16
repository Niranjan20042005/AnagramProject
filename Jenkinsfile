pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/Niranjan20042005/AnagramProject.git', branch: 'main'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('MySonar') {
                    bat 'mvn sonar:sonar -Dsonar.projectKey=AnagramProject -Dsonar.projectName=AnagramProject'
                }
            }
        }
    }
}