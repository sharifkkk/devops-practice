pipeline {
  agent any
  parameters {
    string(name: 'Greeting', defaultvalue: 'Hello', description: 'how should i greet the world?')
  }
  stages {
    stage('example') {
      steps {
        echo "${params.Greeting} World!"
      }
    }
  }
}
