package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();

        for (Map.Entry<String, Integer> it :
                sourceMap.entrySet()) {
            Set<String> x = res.getOrDefault(it.getKey().length(), new HashSet<>());
            x.add(it.getKey());
            res.put(it.getKey().length(), x);
        }
        return res;
    }
}
