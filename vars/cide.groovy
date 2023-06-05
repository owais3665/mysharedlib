def contiDownload(repo)
{  
  git "https://github.com/intelliqittrainings/${repo}"
}

def newBuild()
{
  sh 'mvn package'
}

def contiDeployment(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def contiTesting(repo)
{
   git "https://github.com/intelliqittrainings/${repo}"
  
}
