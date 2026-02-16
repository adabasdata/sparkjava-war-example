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

        stage('SonarQube analysis') {
            environment {
                scannerHome = tool 'saidemy01-sonar-server'
            }
            steps {
                withSonarQubeEnv('sonarqube-server') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }
        }

    }
}

