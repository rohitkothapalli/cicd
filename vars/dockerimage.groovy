def VERSION = '1.0.0'
def dockerImageName= 'krvnb/app_$JOB_NAME:$BUILD_NUMBER'
def call(){

  sh 'docker build -t {dockerImageName} .'
  
}
