pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('deliver') {
      steps {
        sh './jenkins/scripts/deliver.sh'
      }
    }
  }
}