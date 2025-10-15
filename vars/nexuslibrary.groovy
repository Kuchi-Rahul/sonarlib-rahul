def call(String projectDir = '.') {
    echo "Deploying artifacts from ${projectDir} to Nexus"
    sh "mvn -f ${projectDir}/pom.xml deploy"
}
