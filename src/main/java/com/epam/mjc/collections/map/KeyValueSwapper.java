package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapped = new HashMap<>();
        for (Map.Entry<Integer, String> i : sourceMap.entrySet()) {
            Integer key1 = i.getKey();
            String value1 = i.getValue();
            Integer key2 = swapped.get(value1);
            if (swapped.containsKey(value1)) {
                if (key1 > key2) {
                    swapped.put(value1, key2);

                } else {
                    swapped.put(value1, key1);
                }
            }else{
                swapped.put(value1, key1);
            }
        }
        return swapped;
    }
}

