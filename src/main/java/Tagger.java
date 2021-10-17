import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class Tagger {

    public static StringBuilder tagger (Map<String,String> lexicon, String[] fileToBeTagged,String outputFilename){
        StringBuilder processedText = new StringBuilder();
        for (int i = 0; i < fileToBeTagged.length; i++) {
            String holder = fileToBeTagged[i];
            if (lexicon.containsKey(fileToBeTagged[i].toUpperCase())){
                holder +=  "/" + lexicon.get(fileToBeTagged[i].toUpperCase());
            }
            processedText.append(holder + " ");
        }
        try {
            writeOutputfile(processedText, outputFilename);
        }catch(Exception ex){}
        return processedText;

    }
    public static void writeOutputfile(StringBuilder processedText,String fileName) throws Exception{
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(processedText.toString());
        }

    }
}
