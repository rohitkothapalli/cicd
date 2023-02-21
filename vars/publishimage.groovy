def VERSION = '1.0.0'


def call(){
  
  
        sh "docker login -u krvnb -p RohiT.123"
        sh "docker push ${dockerImageName} "
}
