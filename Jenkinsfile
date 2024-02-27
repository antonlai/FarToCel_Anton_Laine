pipeline {
    agent any

    environment {
        PATH = "${env.PATH}:/opt/homebrew/Cellar/maven/3.9.6" // Update the PATH to include the directory of Maven
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'hhttps://github.com/antonlai/FarToCel_Anton_Laine'
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
                always {
                    // You can add more post-build actions here
                }
            }
        }
    }
}