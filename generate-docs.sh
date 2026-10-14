#!/bin/bash
set -e
cd "$(dirname "$0")"
mkdir -p build/generated/edu/txst/assignment2
{ printf 'package edu.txst.assignment2;\n\n'; cat src/edu/txst/assignment2/ShapeManager.java; } > build/generated/edu/txst/assignment2/ShapeManager.java
javadoc -quiet -d docs -encoding UTF-8 -docencoding UTF-8 src/edu/txst/assignment2/{Shape,Circle,Square,Rectangle,Triangle}.java build/generated/edu/txst/assignment2/ShapeManager.java
printf 'Generated docs/index.html\n'
