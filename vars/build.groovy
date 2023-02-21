def VERSION = '1.0.0'
def call(){
 
 sh 'apt-get install maven'
 sh "${mvnHome}/bin/mvn package -Dmaven.test.skip=true"
  
}

