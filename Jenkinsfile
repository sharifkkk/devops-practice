pipeline {
  agent any
  stages {
    stage('build_app') {
      steps {
        echo "${params.Greeting} world !"
      }
    }

    stage('test_app') {
      steps {
        sh 'echo "test the code in host : `hostname`"'
      }
    }

    stage('deploy_app') {
      steps {
        sh 'echo "deploy code in host :`hostname`"'
      }
    }

  }
  parameters {
    string(name: 'Greeting', defaultValue: 'sharif', description: 'how should i greet the world?')
  }
}
