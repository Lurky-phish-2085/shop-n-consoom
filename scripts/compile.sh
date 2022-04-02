#!/bin/sh

classes_dir='classes/'
src_dir='src/'

javac -d $classes_dir -sourcepath $src_dir `find $src_dir -name "*.java"`
