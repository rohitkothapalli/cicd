def VERSION = '1.0.0'

def call(){
   def dockerImageName= 'krvnb/taskapp_$JOB_NAME:$BUILD_NUMBER'
  sh 'cd /var/jenkins_home/workspace/task/target'
  sh 'docker build -t ${dockerImageName} .'
  
}
