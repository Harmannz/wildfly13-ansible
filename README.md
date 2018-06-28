# apache-ansible
Apache SSL termination practise/demo using ansible

This is a guide on setting up an apache virtualhost with ssl termination.
This project will grow into something else, for now it is as is.


## Setup
Add the following to host entries:

```
10.128.251.2 vagrant.wildfly.fun.dis.nz
10.128.251.3 web.vagrant.wildfly.fun.dis.nz
```

Run `vagrant up` and access https://web.vagrant.wildfly.fun.dis.nz