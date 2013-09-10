#make file for lab6

CC=javac

DOC=javadoc -private -d _docs

Main.class : Main.java 
	$(CC) Main.java 2> error.log
	cp Main.java Main.txt

docs : Main.java 
	$(DOC) Main.java




