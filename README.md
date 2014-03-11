# Travel Grant Application

This is an example application used in the paper "Towards Quantifying the Adaptability of Executable BPMN Processes" (link to be provided) presented at [the 6th Central European Workshop on Services and their Composition (ZEUS 2014)](http://zeus2014.org/ZEUS/). In the paper, an adaptability metric is proposed and computed for this process. 

![Travel Grant Process](https://github.com/uniba-dsg/zeus2014/blob/master/src/main/resources/travel-grant-application.png)

The process is executable on Camunda BPM 7.0.0. Eclipse project files are also available, so you can directly open the project in Camunda modeler.

## Requirements
 - Maven
 - Camunda BPMN Tomcat 7.0.0-Final
 
## Usage
 1. `git clone` this repository and execute `mvn install` to build a deployable war file for the application 
 2. Startup Camunda BPM by running the start script appropriate for your system
 3. Copy the generated war file to `$CAMUNDA_HOME\server\apache-tomcat-7.0.33\webapps`. Tomcat should pick up the archive and deploy it automatically
 4. Log in to the BPM platform
 5. Start the "Travel Grant Application Process" via the task list. There is no form for the application, but if you enter a variable named `amount` of type `number` with a value of your choice, the process will execute its different control-flow paths
 
 