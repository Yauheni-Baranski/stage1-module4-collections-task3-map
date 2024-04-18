package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {


    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean res = false;
        for (Map.Entry<Integer, Integer> i : functionMap.entrySet()) {

            Integer currentValue = i.getValue();
            if (currentValue == requiredValue) {
                res = true;
                break;
            } else {
                res = false;
            }
        }
        return res;

    }
    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer i : sourceList) {
            Integer value = 5 * i + 2;
            result.put(i, value);

        }
        return result;
    }
}
