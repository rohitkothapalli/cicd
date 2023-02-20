def call() {
    node {

        stage("Build") {
            sh "mvn -f /Users/krvnbangarraju/Desktop/Merchants compile "
        }
    }
}
