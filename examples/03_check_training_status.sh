#!/bin/bash
#https://app.swaggerhub.com/apis/kyr7/hivemind/0.0.1#/model/modelFind
curl -X POST "http://localhost:8080/model/find" \
 -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"modelId\": \"1d722019-c892-44bc-844b-eb5708d55987\"}"