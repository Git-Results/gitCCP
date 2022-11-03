pipeline {
    agent any
    stages {
        stage('deploy') {
            steps {
              withAWS(credentials: 'AWS_CREDENTIALS', region: 'us-east-1') {
              sh "aws s3 cp clientApp s3://my-static-bucket-jenkins"
              }
            }
        }
    }
}