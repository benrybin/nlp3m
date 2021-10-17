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

        }
        assertTrue(lexiconTest.containsValue("SymptomOrSign"));
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
    public void readLexiconInexception() {
        Map<String,String> lexiconTest = new HashMap<String, String>();
        try {
            lexiconTest = ReadFileIn.readLexiconIn("src/main/resources/lexicontjunit.txt");
        }catch(Exception ex){


        }
        assertFalse(lexiconTest.containsValue("false"));
    }
}