pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Récupérer le code depuis GitHub
                git 'https://github.com/ibniyamine/java_sponsorship.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build du code (par exemple avec Maven)
                sh 'mvn clean package'
            }
        }
        
        stage('Unit Tests') {
            steps {
                // Exécuter les tests unitaires
                sh 'mvn test'
            }
        }

        stage('Deploy to Nexus') {
            steps {
                // Déployer les artefacts sur Nexus
                // Assurez-vous d'avoir configuré les identifiants Nexus dans Jenkins
                sh 'mvn deploy'
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                // Analyser le code avec SonarQube
                // Assurez-vous d'avoir configuré SonarQube dans Jenkins
                script {
                    def scannerHome = tool 'SonarQubeScanner'
                    withSonarQubeEnv('SonarQube') {
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
    }
}
