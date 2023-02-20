def call() {
  node {
    stage('Checkout') {
      // Checkout your source code from Git or another SCM
      git url: 'https://github.com/rohitkothapalli/javaapp'
    }
    stage('Build') {
      // Build the JAR file using Maven
      sh 'mvn clean package'
    }
    stage('Archive') {
      // Archive the JAR file as an artifact
      archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
    }
  }
}
