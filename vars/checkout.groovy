def call(){

  node{

    stage('checkout'){
      git: "https://github.com/rohitkothapalli/javaapp"
    }
    
  }
  
}
