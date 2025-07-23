def call(ip,user) {
  sshagent() {
    sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat10/webapps"
    sh "ssh ${user}@${ip} /opt/tomcat10/bin/shutdown.sh"
    sh "ssh ${user}@${ip} /opt/tomcat10/bin/startup.sh"
  }              
}
