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
	
	stage('Docker Push') {
        steps {
      	withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'DigitalRadar1#', usernameVariable: 'gd43')]) {
        	sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
          	sh 'docker push gd43/docker-javalin-test:latest'
        }
    }
}


