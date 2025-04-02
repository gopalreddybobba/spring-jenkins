pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package' // No need to skip tests
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }            
        }
    }

    post {
        success {
            echo "✅ Build & Test Successful!"
        }
        failure {
            echo "❌ Build or Test Failed!"
        }
    }
}
