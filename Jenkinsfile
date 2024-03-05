pipeline {
    agent any
    tools { 
      maven 'maven' 
      jdk 'default' 
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
