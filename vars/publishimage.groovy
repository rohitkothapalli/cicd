def VERSION = '1.0.0'

def dockerImageName= 'krvnb/app_$JOB_NAME:$BUILD_NUMBER'

def call(){
  
         withCredentials([string(credentialsId: 'krvnb', variable: 'dockerPWD')]) {
              sh "docker login -u krvnb -p RohiT.123"
         }
 
        sh "docker push ${dockerImageName}"
}
