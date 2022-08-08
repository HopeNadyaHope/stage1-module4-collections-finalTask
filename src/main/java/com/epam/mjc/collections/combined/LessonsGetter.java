package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        TreeSet<String> lessons = new TreeSet<>();

        for(List<String> dayLessons : timetable.values()){
            lessons.addAll(dayLessons);
        }

        return lessons;
    }
}
