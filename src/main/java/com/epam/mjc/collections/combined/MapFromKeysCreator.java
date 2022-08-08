package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> keys = sourceMap.keySet();
        for (String key : keys) {
            int len = key.length();
            if(result.containsKey(len)){
                result.get(len).add(key);
            } else {
                HashSet<String> keysWithLen = new HashSet<>();
                keysWithLen.add(key);
                result.put(len, keysWithLen);
            }
        }
        return result;
    }
}
