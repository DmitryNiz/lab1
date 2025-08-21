#!/bin/bash
mkdir lab1
javac -d lab1 Computer.java
jar cf Computer.jar -C lab1 .

