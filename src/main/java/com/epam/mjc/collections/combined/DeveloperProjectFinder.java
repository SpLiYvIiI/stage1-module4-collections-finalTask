package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() == o2.length() ? o2.compareTo(o1) : o2.length() - o1.length();
            }
        });
        for (Map.Entry<String, Set<String>> it :
                projects.entrySet()) {
            if (it.getValue().contains(developer))
                set.add(it.getKey());
        }
        return new ArrayList(Arrays.asList(set.toArray()));
    }
}
