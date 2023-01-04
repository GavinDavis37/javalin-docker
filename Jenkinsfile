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
	      	sh 'docker build -t gd43/docker-javalin-test:latest .'
	      }
	}
	
	stage('Docker Push') {
		steps {
	      	withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        		sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
		  	sh 'docker push gd43/docker-javalin-test:latest'
		}
    	}
    }
}
}

