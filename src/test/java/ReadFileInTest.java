import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReadFileInTest {

    @org.junit.Test
    public void readLexiconIn() {
        Map<String,String> lexiconTest = new HashMap<String, String>();
        try {
             lexiconTest = ReadFileIn.readLexiconIn("src/main/resources/lexicontjunit.txt");
        }catch(Exception ex){
        System.out.println(lexiconTest.get("BANDS"));
        }
        assertTrue("Device|Anatomy-Desc|Histology".equals(lexiconTest.get("BANDS")));
    }
    @org.junit.Test
    public void readLexiconInNegative() {
        Map<String,String> lexiconTest = new HashMap<String, String>();
        try {
            lexiconTest = ReadFileIn.readLexiconIn("src/main/resources/lexicontjunit.txt");
        }catch(Exception ex){

        }
        assertFalse(lexiconTest.containsValue("false"));
    }
    @org.junit.Test(expected = Exception.class)
    public void readLexiconInexception() throws Exception {
        Map<String,String> lexiconTest = new HashMap<String, String>();

            lexiconTest = ReadFileIn.readLexiconIn("src/main/resources/lexicontjunitexp.txt");


    }

    @Test
    public void readFileIn() throws Exception {
        String[] testarray = ReadFileIn.readFileIn("src/main/resources/document");

        assertTrue(!(testarray==null));

    }
}