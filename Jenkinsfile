pipeline {
  agent any
  stages {
    stage('build_app') {
      parallel {
        stage('build_app') {
          steps {
            echo "${params.Greeting} world !"
          }
        }

        stage('builld 1.1') {
          steps {
            sh 'sleep 5 && echo "parallel step 1.1"'
          }
        }

        stage('build 1.2') {
          steps {
            sh 'sleep 5 && echo "parallel step 1.2"'
          }
        }

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