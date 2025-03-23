package pipeline

import snataak.common.clean
import snataak.common.clone
import snataak.golang.unit

def call(String branch, String repoUrl, String credentialsId = null, String reportsDir) {
    stage('Cleanup') {
        clean()
    }

    stage('Clone Repository') {
        clone(branch, repoUrl, credentialsId)
    }

    stage('Run Go Unit Tests') {
        unit(reportsDir)
    }
} 
