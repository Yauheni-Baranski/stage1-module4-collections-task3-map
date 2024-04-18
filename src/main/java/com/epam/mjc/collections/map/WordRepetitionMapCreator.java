package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.replaceAll("\\.", "");
        String[] words = sentence.toLowerCase().split("\\s+|,\\s*");
        Map<String, Integer> result = new HashMap<>();
        if(sentence.isEmpty()){
            return result;
        }
        for( String i : words){
            if (!result.containsKey(i)){
                result.put(i, 1);
            }else{
                int currentValue = result.get(i);
                result.put(i, currentValue +1);


            }

        }
        return result;


    }
}
