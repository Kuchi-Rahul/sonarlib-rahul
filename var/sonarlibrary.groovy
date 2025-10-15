def call(String projectDir = '.') {
    echo "Running SonarQube analysis in ${projectDir}"
    sh "mvn -f ${projectDir}/pom.xml sonar:sonar"
}
