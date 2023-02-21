def VERSION = '1.0.0'
def call(){

 def mvnHome =  tool name: '', type: 'maven' 
 sh "${mvnHome}/bin/mvn package -Dmaven.test.skip=true"
  
}

