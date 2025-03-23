package snataak.template

import snataak.common.*
import snataak.golang.*

def call(String branch, String repoUrl, String credentialsId = null, String reportsDir) {
    CLEAN = new clean()
    CLONE = new clone()
    UNIT = new unit()

    
    CLEAN.call()
    CLONE.call(branch, repoUrl, credentialsId)
    UNIT.call(reportsDir)
    
}
