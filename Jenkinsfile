pipeline {
    agent any

    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package' 
            }
        }
        
        stage('Docker Build') {
	      steps {
	      	sh 'docker build -t javalin-app .'
	      }
	}
    }
}


