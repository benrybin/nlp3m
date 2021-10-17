import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ReadFileIn {


    public static  Map<String,String> readLexiconIn(String pathName) throws Exception {
        Map<String,String> tags = new HashMap();
        String lexicon = new String(Files.readAllBytes(Paths.get(pathName)));



        String[] lexiconSplit = lexicon.split("(\\s)");
       if(!(lexiconSplit.length % 2==0)){
            throw new Exception();
       }
        for (int i = 0; i <lexiconSplit.length-1 ; i +=2){



            tags.put(lexiconSplit[i].trim(),lexiconSplit[i+1].trim());

        }

        return tags;


    }
    public static String[] readFileIn(String fileName)throws Exception{
        String fileToBeTagged = new String(Files.readAllBytes(Paths.get(fileName)));
        String[] filetoBeTaggedSplit = fileToBeTagged.split(" +|(?=\\n)|(?<=\\n)");




        return filetoBeTaggedSplit;
    }

}
