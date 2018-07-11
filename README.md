# Wildfly13-ansible Demo
This is a demo on setting up apache virtual with ssl termination that proxy passes to a wildfly app.
The environment has been setup using Ansible.

The following things have been added 

### Wildfly 13
- [x] Configure for EE8
- [x] Set logger for custom package
- [x] Create an admin account
- [x] Add a truststore

Constraints:
  - Cannot edit standalone.xml by hand. Everything MUST be done via CLI


### Hello world app
A simple hello world app is deployed that does basic logging to show that it works.
 
  

## Setup
Add the following to host entries:

```
10.128.251.2 vagrant.wildfly.fun.dis.nz
10.128.251.3 web.vagrant.wildfly.fun.dis.nz
10.128.251.4 app.vagrant.wildfly.fun.dis.nz
```

Run `vagrant up` from platform directory

### Certs
Add myCa.key certificate to your trusted root.

## Deployment
Run `mvn clean install -Pdeploy` from build/app directory to build and deploy a test app to the vagrant.

Go to: https://web.vagrant.wildfly.fun.dis.nz/app to verify it works! 