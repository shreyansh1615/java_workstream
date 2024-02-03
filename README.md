# java_workstream
# install jdk-17
# install mavnen-3.9.5
# if you are using Apple M1, set the classpath of java and maven.

# Check java_home path, where java already installed.
>> /usr/libexec/java_home
>> echo $SHELL

# Open '.zshrc' file using vi editor,and update with below for java and maven
>> vi ~/.zshrc

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
export PATH=${JAVA_HOME}/bin:$PATH
export M2_HOME=/Users/<sarojsahoo>/softwares/apache-maven-3.9.5
export PATH=$M2_HOME/bin:$PATH

# After update, close the Terminal and open a new Terminal or you can use below command in same console.
>> source ~/.zshrc

# check java_home path and mvn command
>> echo $JAVA_HOME
>> echo $PATH
>> mvn -V
>> java -version

# Open Terminal to compile and run the code using maven command
>> mvn clean package
>> mvn exec:java


