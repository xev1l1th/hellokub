#!/bin/sh
docker build -t hellokub:v1 .
docker tag hellokub:v1 localhost:5000/hellokub:v1
docker push localhost:5000/hellokub:v1
