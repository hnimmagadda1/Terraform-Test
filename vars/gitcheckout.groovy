def call(){
  checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'git@github.com:hnimmagadda1/Terraform-Test.git']]])
}
