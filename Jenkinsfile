pipeline {
    agent any
    tools { 
      maven 'maven' 
      jdk 'default' 
    }

    environment {
        PATH = "${env.PATH}:/opt/homebrew/Cellar/maven/3.9.6" // Update the PATH to include the directory of Maven
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/antonlai/FarToCel_Anton_Laine'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}
