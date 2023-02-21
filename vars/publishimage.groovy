def VERSION = '1.0.0'

def call(){
 
        sh "docker push ${dockerImageName}"
}
