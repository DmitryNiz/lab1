#!/bin/bash

mkdir -p jararch
javac -d jararch *.java
echo "Main-Class: Computer" > manifest.txt
jar cfm Computer.jar manifest.txt -C jararch .
rm manifest.txt

