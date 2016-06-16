SpringMVC+Spring+MyBatis
========================

Frameworks and Tools
-----------------------------------
* Java&IDE: JDK7 IDEA
* Backend:  SpringMVC3.2.9 Spring3.2.9 MyBatis3.1.1 (Configured by annotation)
* Database: Mysql
* Web Server: Tomcat 7
* Build Tool: Maven 3.3.9
* RPC: Hessian 4
* Other: Druid(database connection pool) JUnit Log4j Jackson FastJson

System Features
-----------------------------------
* Integration of Spring core, Spring MVC, and MyBatis
* Management of users through CRUD interface

Code Generator for MyBatis
-----------------------------------
* You can find code generator from [the link](http://mybatis.github.io/generator/)
* In the folder of mybatis-generator, you can find generator.xml and mybatis-generator-core-1.3.2.jar. 
* Download these two files in the folder of C:\mybatis, and run the following command:
  java -jar mybatis-generator-core-1.3.2.jar -configfile generator.xml -overwrite
* Then Java POJOs that match the table structure will be generated.

About
-----------------------------------
* [Github link](https://github.com/jgroups)
