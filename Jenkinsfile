pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages{
        stage("Test"){
            steps{
                sh 'mvn test'
            }
        }
        stage("Build"){
            steps{
                sh 'mvn install'
            }
        }
        stage("Deploy on Prod"){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcat9Details', path: '', url: 'http://172.18.122.172:8080')], contextPath: '/app', war: '**/*.war'
            }
        }
    }
    post{
        success{
            echo "Pipeline executed successfully"
        }
        failure{
            echo "Pipeline execution failed"
        }
    }
}
