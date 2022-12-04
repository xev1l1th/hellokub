#!/bin/sh
kubectl delete deployment hellokub-v1
kubectl delete deployment hellokub-v2
sudo kubectl apply -f ./deploy/roflandeployment.yaml
kubectl delete service hellokub
kubectl apply -f ./deploy/roflanservice.yaml
kubectl delete configmap hellokub
kubectl apply -f ./deploy/config/roflankub-config.yaml
