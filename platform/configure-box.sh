#!/bin/bash
set -e

echo "Enabling EPEL repo"
yum --enablerepo=extras install -y epel-release

echo "Installing ansible"
yum install -y ansible

echo "Configuring network"
sudo nmcli con del enp0s8 | true
sudo nmcli con add type ethernet ifname enp0s8 con-name enp0s8
sudo nmcli con mod enp0s8 ipv4.addresses '10.128.251.2,10.128.251.3,10.128.251.4' ipv4.method manual ipv4.routes 10.0.0.0/16
sudo systemctl restart network
