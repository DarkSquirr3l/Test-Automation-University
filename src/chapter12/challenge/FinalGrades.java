package chapter12.challenge;

import java.util.HashMap;
import java.util.Map;

public class FinalGrades {

    public static void main(String[] args) {

        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> reSitGrades = TestResults.getMakeUpGrades();
        Map<String, Integer> finalGrades = new HashMap<>();

        reSitGrades.forEach(
                (key, val) -> {if(originalGrades.get(key) > val) {
                    finalGrades.put(key,(originalGrades.get(key)));
                } else
                    finalGrades.put(key, val);
        }
    );
        System.out.println(finalGrades);
    }


}
