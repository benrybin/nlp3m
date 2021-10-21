import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ReadFileIn {
    private static final Logger logger = Logger.getLogger(ReadFileIn.class.getName());

    public static  Map<String,String> readLexiconIn(String pathName) throws Exception {
        Map<String,String> tags = new HashMap();
        String lexicon = new String(Files.readAllBytes(Paths.get(pathName)));
        //TODO This step should not be necessary but for some reason the split ignores \r should be ok because we don't return lexicon
        lexicon = lexicon.replaceAll("\\r","");



        String[] lexiconSplit = lexicon.split("(\\s)");
       if(!(lexiconSplit.length % 2==0)){
           logger.severe("Something went wrong with Lexicon creation");
            throw new Exception();

       }
        for (int i = 0; i <lexiconSplit.length-1 ; i +=2){



            tags.put(lexiconSplit[i].trim(),lexiconSplit[i+1].trim());

        }
        logger.info("Lexicon created completed");
        return tags;


    }
    public static String[] readFileIn(String fileName){
        String fileToBeTagged = new String();
        try{
             fileToBeTagged = new String(Files.readAllBytes(Paths.get(fileName)));

        }catch(Exception ex){
            logger.severe("Reading file in failed please see error: " + ex.getMessage() + ex.getStackTrace());
        }

        String[] filetoBeTaggedSplit = fileToBeTagged.split(" +|(?=\\n)|(?<=\\n)");
        logger.info("Files to be tagged array created");
        return filetoBeTaggedSplit;
    }

}
