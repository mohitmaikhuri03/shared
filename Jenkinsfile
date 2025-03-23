@Library('mera@main') _

def a = new snataak.template.One()

pipeline {
    agent any

    stages {
        stage('Run Pipeline') {
            steps {
                script {
                    a.call('main', 'https://github.com/snaatak-Zero-Downtime-Crew/employee-api.git', 'Snaatak', 'test-reports')
                }
            }
        }
    }
}
