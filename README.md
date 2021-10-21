Readme File for NLP 3M Solution

This project takes in a text file and a lexicon then it tags anything that matches in the lexicon.

This project was created using Java SDK 11 but should work on Java 8 and above.

Class file is included but I recommend going into the java folder and running javac FileReaderNPL.java
again to recreate the class file.
You must be in the java folder nlp3m/src/main/java
Once class file is created you can use java FileReaderNPL lexicon document solution.txt this will work as is because i have provided the test files.
As shown the first argument is the name of the lexicon which should be put in the provided files folder.
The second argument is the file to be tagged which should also go in the files folder.
The third argument is the name of the output file which will be created in the filed folder.

Must be in nlp3m folder.
You can run the tests by using mvn test I was having issues with my maven you should also be able to build it with maven clean install but my maven
was giving me issues
ToDo add custom exceptions, output file has extra spaces on end lines, lexicon plurals are ignored,
ToDo didn't have time to test unix /r endlines should work but untested, a couple test should be using mockito,
ToDO Used static classes could use spring to just inject it so don't need to use static, min max lexicon to speed up tagging
ToDo basically ignore anything to big or small to match lexicon


