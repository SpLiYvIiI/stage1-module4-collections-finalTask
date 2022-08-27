package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new TreeSet<>();
        for (Map.Entry<String, List<String>> it :
                timetable.entrySet()) {
            for (String x :
                    it.getValue()) {
                set.add(x);
            }
        }
        return set;
    }
}
