import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TaggerTest {

    @Test
    public void tagger() {
        Map<String,String> testMap = new HashMap<>();
        testMap.put("AEROEMBOLUS","DiagnosisOrProblem");
        String[] testArray = {"AEROEMBOLUS","AEROEMBOLUS.","AEROEMBOLUS?"};
        String filePath = "junitTest";
        StringBuilder testString = Tagger.tagger(testMap,testArray,filePath);
        System.out.println(testString.toString());
        assertTrue(testString.toString().contains("AEROEMBOLUS/DiagnosisOrProblem"));
        assertTrue(testString.toString().contains("AEROEMBOLUS/DiagnosisOrProblem."));
        assertTrue(testString.toString().contains("AEROEMBOLUS/DiagnosisOrProblem?"));
        assertFalse(testString.toString().contains("AEROEMBOLUS/DiagnosisOrProblem!"));
    }

    @Test
    public void writeOutputfile() {
    }
}