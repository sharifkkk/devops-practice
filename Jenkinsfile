pipeline {
agent any
parameters{
         string(name: 'Greeting', defaultValue: 'sharif', description: 'how should i greet the world?')
}
stages {
  stage('example'){
steps {
      echo "${params.Greeting} world !"
}
}
}
}

