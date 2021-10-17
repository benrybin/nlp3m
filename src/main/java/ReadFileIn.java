import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ReadFileIn {


    public static  Map<String,String> readLexiconIn(String pathName) throws Exception {
        Map<String,String> tags = new HashMap();
        String lexicon = new String(Files.readAllBytes(Paths.get(pathName)));



        String[] lexiconSplit = lexicon.split("\\s(?!\\n)");
       if(!(lexiconSplit.length % 2==0)){
            throw new Exception();
       }
        for (int i = 0; i <lexiconSplit.length-1 ; i++) {

            int j = i +1;

            tags.put(lexiconSplit[i].trim(),lexiconSplit[j].trim());

        }

        return tags;


    }

}
