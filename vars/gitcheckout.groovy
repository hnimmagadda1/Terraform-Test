def call(){
  checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/hnimmagadda1/Terraform-Test.git']]])
}
