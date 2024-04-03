package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class D02P5E {
    public static void main(String[] args) {
        String[] words1 = {"abc", "efg", "cde", "ghi", "ija"};
        System.out.println(canFormCircle(words1)); // Output: Yes

        String[] words2 = {"Ijk", "kji", "abc", "cba"};
        System.out.println(canFormCircle(words2)); // Output: No
    }

    public static boolean canFormCircle(String[] words) {
        if (words == null || words.length == 0) {
            return false;
        }

        Map<Character, List<String>> graph = new HashMap<>();
        Map<String, Integer> indegree = new HashMap<>();

        // Build the graph
        for (String word : words) {
            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);
            graph.putIfAbsent(start, new ArrayList<>());
            graph.get(start).add(word);
            indegree.put(word, indegree.getOrDefault(word, 0) - 1); // Negative indegree for start nodes
            indegree.put(end + "", indegree.getOrDefault(end + "", 0) + 1); // Positive indegree for end nodes
        }

        // Perform DFS traversal to check if there's a Hamiltonian path
        Set<String> visited = new HashSet<>();
        for (String word : words) {
            if (dfs(word, visited, graph, indegree)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(String word, Set<String> visited, Map<Character, List<String>> graph, Map<String, Integer> indegree) {
        if (visited.contains(word)) {
            return false; // Cycle detected
        }
        visited.add(word);

        char end = word.charAt(word.length() - 1);
        List<String> nextWords = graph.getOrDefault(end, new ArrayList<>());
        for (String next : nextWords) {
            if (dfs(next, visited, graph, indegree)) {
                return true;
            }
        }
        visited.remove(word); // Backtrack
        return false;
    }
}