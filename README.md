# Wildfly13-ansible Demo
This is a demo on setting up apache virtual with ssl termination that proxy passes to a wildfly app.


## Setup
Add the following to host entries:

```
10.128.251.2 vagrant.wildfly.fun.dis.nz
10.128.251.3 web.vagrant.wildfly.fun.dis.nz
10.128.251.4 app.vagrant.wildfly.fun.dis.nz
```

Run `vagrant up` from platform directory

## Deployment
Run `mvn clean install -Pdeploy` from build/app directory to build and deploy a test app to the vagrant.

Go to: https://web.vagrant.wildfly.fun.dis.nz/app to verify it works! 