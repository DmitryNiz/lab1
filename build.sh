#!/bin/bash

mkdir -p jararch
javac -d jararch *.java
jar cef Computer Computer.jar -C jararch .


