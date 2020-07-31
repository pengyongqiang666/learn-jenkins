FROM registry.cn-beijing.aliyuncs.com/15172447483/centos7-jdk8:v1
COPY target/learn-jenkins.jar /
EXPOSE 8081
ENTRYPOINT ["java","-jar","learn-jenkins.jar"]