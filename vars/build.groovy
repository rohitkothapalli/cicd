def call(Map args=[:], Closure body={}) {
    node {

        stage("Build") {
            sh "mvn -f /Users/krvnbangarraju/Desktop/Merchants compile "
        }
    }
}
