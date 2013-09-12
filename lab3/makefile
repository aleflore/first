#make file for lab3

CC=javac

DOC=javadoc -private -d _docs

Lab3.class : Lab3.java 
	$(CC) Lab3.java 2> error.log
	cp Lab3.java Lab3.txt

docs : Lab3.java 
	$(DOC) Lab3.java

