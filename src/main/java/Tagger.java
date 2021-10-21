import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.logging.Logger;

public class Tagger {
    private static final Logger logger = Logger.getLogger(Tagger.class.getName());

    public static StringBuilder tagger (Map<String,String> lexicon, String[] fileToBeTagged,String outputFilename){
        logger.info("Tagging Started" );
        StringBuilder processedText = new StringBuilder();
        String last = new String();
        //TODO this area need to be cleaned up also to increase performance we can capture the max and min string length from the lexicon so we can ignore strings greater or smaller
        for (int i = 0; i < fileToBeTagged.length; i++) {
            String holder = fileToBeTagged[i];
            int len =0;
            if(fileToBeTagged[i].length() >1) {
                len = fileToBeTagged[i].length() - 1;
                last = fileToBeTagged[i].substring(len);

            }
            if(fileToBeTagged[i].contains("'s")){
                holder = fileToBeTagged[i].substring(0, len-1);
                holder +=  "/" + lexicon.get(fileToBeTagged[i].substring(0, len-1).toUpperCase()) + "'s";
                logger.info("Match found in Lexicon: " + fileToBeTagged[i] );
            }


            if(last.equals(".")||last.equals("?")||last.equals("!")||last.equals(":")||last.equals(";")||last.equals("-")) {
                if ((lexicon.containsKey(fileToBeTagged[i].substring(0, len).toUpperCase()))) {
                    holder = fileToBeTagged[i].substring(0, len);

                    holder += "/" + lexicon.get(holder.toUpperCase()) + last;
                    logger.info("Match found in Lexicon: " + fileToBeTagged[i] );
                }
            }

            if (lexicon.containsKey(fileToBeTagged[i].toUpperCase())){
                holder +=  "/" + lexicon.get(fileToBeTagged[i].toUpperCase());
                logger.info("Match found in Lexicon: " + fileToBeTagged[i] );
            }

                processedText.append(holder + " ");

        }
        try {
            writeOutputfile(processedText, outputFilename);
        }catch(Exception ex){}
        return processedText;

    }
    public static void writeOutputfile(StringBuilder processedText,String fileName) throws Exception{
        logger.info("File being created called " + fileName );
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(processedText.toString());
        }



    }

}
