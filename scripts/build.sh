#!/bin/sh

classes_dir='classes/'
src_dir='src/'

builds_dir='./builds'

jar='shop-n-consoom.jar'
main_class='Main'

[ -d $builds_dir ] || mkdir $builds_dir &&
	jar -cvfe $builds_dir/$jar $main_class -C $classes_dir .
