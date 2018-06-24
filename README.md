# apache-ansible
Apache SSL termination practise/demo using ansible

This is a guide on setting up an apache virtualhost with ssl termination.
This project will grow into something else, for now it is as is.


## Setup
Add the following to host entries:

```
10.255.250.2 vagrant.apache.fun.dis.nz
10.255.250.3 web.vagrant.apache.fun.dis.nz
```

Run `vagrant up` and access https://web.vagrant.apache.fun.dis.nz