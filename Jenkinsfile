pipeline {
    agent any

    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package' 
            }
        }
        
        stage('Docker Build') {
	      agent any
	      steps {
	      	sh 'docker build -t javalin-app .'
	      }
	}
    }
}


