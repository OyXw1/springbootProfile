# springbootProfile
Profile配置文件说明及打包线上部署
1、修改pom.xml文件spring-boot-starter-web
2、在resources中建立application.properties（激活的配置文件spring.profiles.active=dev）、application-dev.properties、application-prod.properties
3、建两个文件HiController.java(配置文件中值的取值方式@Value("${name}"))，App.java
4、将 SpringBoot 打包成可执行的 Jar/war（cd文件目录-mvn package）-target->javr-jar->访问地址栏
