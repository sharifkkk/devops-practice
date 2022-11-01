pipeline {
agent any
parameters {
          string(name: 'Greeting', defaultValue: 'hello', description: 'how should i greet the world?')
}
stages {
stage('example') {
steps {
  echo "${params.Greeting} World !"
}
}
}
}
