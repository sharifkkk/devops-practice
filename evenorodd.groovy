def call(int buildNumber){
if(buildNumber %2 == 0){
pipeline {
agent any
stages {
stage('even stage'){
steps {
echo "the buildNumber is even"
}
}
}
}
}else{
pipeline {
agent any
stages {
stage('odd stage'){
steps {
echo "the buildnumber is odd"

}
}
}
}
}
}
