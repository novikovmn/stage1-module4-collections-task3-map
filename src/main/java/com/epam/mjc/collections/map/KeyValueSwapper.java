package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<Integer, String> pair : sourceMap.entrySet()){
            if (result.containsKey(pair.getValue())) {
                if (result.get(pair.getValue()) > pair.getKey()){
                    result.put(pair.getValue(), pair.getKey());
                }
            }else {
                result.put(pair.getValue(), pair.getKey());
            }
        }

        return result;
    }
}
