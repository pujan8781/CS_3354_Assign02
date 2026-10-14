#!/bin/bash
set -e
cd "$(dirname "$0")"
mkdir -p build/generated/edu/txst/assignment2 build/classes
# Keep the instructor's original ShapeManager.java unchanged.
# Compile a copy with the required package declaration.
{ printf 'package edu.txst.assignment2;\n\n'; cat src/edu/txst/assignment2/ShapeManager.java; } > build/generated/edu/txst/assignment2/ShapeManager.java
javac -d build/classes src/edu/txst/assignment2/Shape.java src/edu/txst/assignment2/Circle.java src/edu/txst/assignment2/Square.java src/edu/txst/assignment2/Rectangle.java src/edu/txst/assignment2/Triangle.java build/generated/edu/txst/assignment2/ShapeManager.java
java -cp build/classes edu.txst.assignment2.ShapeManager
