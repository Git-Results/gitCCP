//testing

pipeline {
    agent any
    stages {
        stage('deploy') {
            steps {
                withAWS(credentials: 'AWS_CREDENTIALS', region: 'us-east-1') {
                    s3Upload bucket: 'my-static-bucket-jenkins', file: 'clientApp'
                }
            }
        }
    }-
}