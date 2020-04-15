package eu.edu.npu.lab01.Task08;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        String text = " I love and love and hate and hate ";
        System.out.println(text);
        String [] words = text.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<String, Integer>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}
