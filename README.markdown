## Setup Instructions ##

#### 1. Clone the project. ####

    cd ~/git
    git clone git@git.assembla.com:full-stack-hacker.wst.01.git
    cd full-stack-hacker.wst.01

#### 2. Start the Java server. ####

    cd ~/git/full-stack-hacker.wst.01/server
    mvn clean compile
    mvn -Djetty.port=8680 jetty:run

