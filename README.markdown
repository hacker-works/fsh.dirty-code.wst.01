## Intro

Welcome to one of [hacker.works][hacker.works] work sample tests!

Our experience shows that the best predictor of whether you are going to perform at [hacker.works][hacker.works] is a work sample test. We give you a sample piece of work, similar to what you will do in the job and assess the results you produce.

Chek the **setup instruction**, carefully read the **test objectives** below and good luck!

## Setup Instructions

#### 1. Clone the project.

    cd ~/git
    git clone git@github.com:hacker-works/fsh.dirty-code.wst.01.git
    cd fsh.dirty-code.wst.01
    git pull --all
    git checkout feature/dirty-code

#### 2. Start the Java server.

    cd ~/git/fsh.dirty-code.wst.01/server
    mvn clean compile
    mvn -Djetty.port=8680 jetty:run

#### 3. Import the project into Eclipse or IntelliJ, or any editor or IDE you're used working with.

**NOTE:** If something is not working as expected, or gives compile or configuration issues, you should fix it. 

#### 4. Start hacking! 


> **WARNING:** What you're about to see is a very dirty and messy piece of code. This is intentionally prepared this way. This is not the hacker's way! We have a clean version of this code to proove it. 

## Test Objectives

The objective of this work sample test is to clean this dirty code:

* resolve all code issues you can find
* apply coding and design principles and maxims such as DRY and SOLID
* identify and resolve design issues
* resolve anything that you find wrong with this code 
* **BIG** bonus points for adding tests

Keep in mind, we're not imposing any restrictions on keeping the functionality, method interfaces, etc. 

Be creative!

## How to submit your solution?

Just create a [new pull request][github.pull] in GitHub and we'll let you know when we start reviewing your solution. 

[hacker.works]: http://hacker.works
[github.pull]: https://github.com/hacker-works/fsh.dirty-code.wst.01/pulls
