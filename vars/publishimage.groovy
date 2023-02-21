def VERSION = '1.0.0'

def call(){
 
  withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerPWD')]) {
              sh "docker login -u krvnb -p ${dockerPWD}"
         }
        sh "docker push ${dockerImageName}"
}
