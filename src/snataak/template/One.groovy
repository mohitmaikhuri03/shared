package snataak.template

import snataak.common.*
import snataak.golang.*

def call(String branch, String repoUrl, String credentialsId = null, String reportsDir) {
    Clean()
    Clone(branch, repoUrl, credentialsId)
    Unit(reportsDir)
}
