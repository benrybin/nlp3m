public class FileReaderNPL {
    public static void main(String[] args) throws Exception {
        //Use when running from terminal
       Tagger.tagger(ReadFileIn.readLexiconIn("files/"+args[0]),ReadFileIn.readFileIn("files/" + args[1]),"files/" + args[2]);
        //Use when running from IDE
        //Tagger.tagger(ReadFileIn.readLexiconIn("lexicon"),ReadFileIn.readFileIn("document1"),"testfile.txt");

    }
    }
