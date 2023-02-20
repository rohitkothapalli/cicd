def call() {
  node {
    stage('Build') {
      // Build the JAR file using Maven
      sh 'mvn clean package'
    }
  }
}
