FROM registry.access.redhat.com/ubi8/ubi


RUN yum install -y java-11-headless vim
ADD Procs.java Procs.java
