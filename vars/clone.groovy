def VERSION = '1.0.0'
def call(){

  sh 'cd /var/jenkins_home/workspace/task'
  git branch: 'rohitkothapalli', url: 'https://github.com/rohitkothapalli/javaapp'
  
}
