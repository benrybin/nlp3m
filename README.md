Readme File for NLP 3M Solution

This project takes in a text file and a lexicon then it tags anything that matches in the lexicon.

This project was created using Java SDK 11 but should work on Java 8 and above.

Class file is included but I recommend going into the java folder and running javac FileReaderNPL.java
again to recreate the class file.

You must be in the java folder nlp3m/src/main/java
Step 1: javac FileReaderNPL.java
Step 2: java FileReaderNPL lexicon document solution.txt
First Arugment is Lexicon, Second is file to be processed, and 3rd is name of file to be returned files must be in the provided file folder.
Test files are included. 

Must be in nlp3m folder.
You can run the tests by using mvn test I was having issues with my maven you should also be able to build it with maven clean install but my maven
was giving me issues

Things that I wanted to add:

* Custom Exceptions
* Clean up output file
* Lexicon plurals
* Peformance improvments by getting min max char length and igonroing strings to long or short to match



