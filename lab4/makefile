#make file for lab4

CC=javac

DOC=javadoc -private -d _docs

ComputeFigure.class : ComputeFigure.java 
	$(CC) ComputeFigure.java 2> error.log
	cp ComputeFigure.java ComputeFigure.txt

docs : ComputeFigure.java
	$(DOC) ComputeFigure.java

