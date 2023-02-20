def call(){

    sh 'docker login -u 'krvnb' -p 'RohiT.123''
    sh 'docker build -t Dockerfile /Users/krvnbangarraju/Desktop/Merchants/target/classes/com/example/'
    
}
    
