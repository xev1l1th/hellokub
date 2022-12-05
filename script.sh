#!/bin/sh
kubectl delete deployment hellokub-v1
kubectl apply -f ./deploy/roflandeployment.yaml
kubectl delete service hellokub
kubectl apply -f ./deploy/roflanservice.yaml
kubectl delete configmap hellokub
kubectl apply -f ./deploy/config/roflankub-config.yaml
kubectl apply -f ./deploy/config/role.yml
kubectl apply -f ./deploy/config/cluster-role.yml
kubectl create clusterrolebinding default-pod --clusterrole cluster-admin --serviceaccount=default:default