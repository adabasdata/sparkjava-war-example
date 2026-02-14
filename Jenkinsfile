pipeline {
    agent any
    environment {
        PATH = "/opt/maven/bin:$PATH"
    }

    stages {
        

        stage('Build WAR') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
