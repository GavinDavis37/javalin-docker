pipeline {
    agent any

    stages {
        stage('Test') {
	      steps {
			sh(script: 'mvn clean test -Ptest')
	      }
		}
		
		stage('Build') { 
            steps {
                sh 'mvn clean package -Dmaven.test.skip=true -Pgenerate-jar' 
            }
        }
        
        stage('Docker Build') {
	      steps {
			sh 'echo "Current Working Directory" && pwd'
	      	sh 'docker build --no-cache -t gd43/docker-javalin-test:latest .'
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
    post {
	    always {
	      junit(testResults: 'target/surefire-reports/*.xml', allowEmptyResults : true)
          emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'
	    }
	}
}

