def VERSION = '1.0.0'


def call(){
   
  sh 'cd /var/jenkins_home/workspace/task/target'
  sh 'docker build -t dockerfile .'
  
}
