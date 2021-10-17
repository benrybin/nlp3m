public class FileReaderNPL {
    public static void main(String[] args) throws Exception {

      // Tagger.tagger(ReadFileIn.readLexiconIn("files/"+args[0]),ReadFileIn.readFileIn("files/" + args[1]),"files/" + args[2]);
       Tagger.tagger(ReadFileIn.readLexiconIn("lexicon"),ReadFileIn.readFileIn("document1"),"testfile.txt");

    }
    }
