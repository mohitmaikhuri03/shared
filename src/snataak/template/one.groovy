package snataak.template

import snataak.common.*
import snataak.golang.*

def call(String branch, String repoUrl, String credentialsId = null, String reportsDir) {

    def CLEAN = new Clean() 
    def CLONE = new Clone()
    def UNIT = new Unit()

    CLEAN.call()
    CLONE.call(branch, repoUrl, credentialsId)
    UNIT.call(reportsDir)
}

