#This is a comment.  It is ignored by the make utility.
CC=javac -d
DOC=javadoc -private -d _docs

HiddenSquares.class : HiddenSquares.java
	$(CC) HiddenSquares.java 2> errorlog
	cp HiddenSquares.java HiddenSquares.txt

docs : Hiddensquares.java
	$(DOC) HiddenSquares.java
