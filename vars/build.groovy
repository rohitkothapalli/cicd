def VERSION = '1.0.0'
def call(){

  sh 'mvn clean package'
  
}
