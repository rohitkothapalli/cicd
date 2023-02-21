def VERSION = '1.0.0'


def call(){
  
  
        def dockerImageName= 'krvnb/taskapp_$JOB_NAME:$BUILD_NUMBER'
  
        sh "docker login -u krvnb -p RohiT.123"
        sh "docker push ${dockerImageName} "
}
