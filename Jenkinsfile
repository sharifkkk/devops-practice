pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'echo "building !.."'
      }
    }
    stage('test') {
      steps {
        sh '''echo "testing !..."
       bash ${WORKSPACE}/git/readme.md
          '''
      }
    }
    stage('deploy') {
      steps {
        sh 'echo "deploying ! .."'
      }
    }
  }
}
