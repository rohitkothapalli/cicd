def VERSION = '1.0.0'
def call(){

 def mvnHome =  tool name: 'Maven 3.5.4', type: 'maven'   
 sh "${mvnHome}/bin/mvn package -Dmaven.test.skip=true"
  
}

