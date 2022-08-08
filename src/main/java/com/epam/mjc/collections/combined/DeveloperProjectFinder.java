package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developersProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                developersProjects.add(entry.getKey());
            }
        }
        developersProjects.sort(((o1, o2) -> {
            int len1 = o1.length();
            int len2 = o2.length();
            if (len1 == len2) {
                return o2.compareTo(o1);
            }
            return len1 < len2 ? 1 : -1;
        }));

        return developersProjects;
    }
}
