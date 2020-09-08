package pre.core;

import java.util.*;
import java.util.stream.Stream;

public class SubTree {

    public static void main(String[] args){

        int n = 7;
        int[][] edges ={{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        String labels = "abaedcd";
        int[] result = countSubTrees(7, edges, labels);
        Stream.of(Arrays.toString(result)).forEach(System.out::println);
    }

    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> edgesMap = new HashMap<Integer, List<Integer>>();
        for (int[] edge : edges) {
            int node0 = edge[0], node1 = edge[1];
            List<Integer> list0 = edgesMap.getOrDefault(node0, new ArrayList<Integer>());
            List<Integer> list1 = edgesMap.getOrDefault(node1, new ArrayList<Integer>());
            list0.add(node1);
            list1.add(node0);
            edgesMap.put(node0, list0);
            edgesMap.put(node1, list1);
        }
        int[] counts = new int[n];
        boolean[] visited = new boolean[n];
        depthFirstSearch(0, counts, visited, edgesMap, labels);
        return counts;
    }

    public static int[] depthFirstSearch(int node, int[] counts, boolean[] visited, Map<Integer, List<Integer>> edgesMap, String labels) {
        visited[node] = true;
        int[] curCounts = new int[26];
        curCounts[labels.charAt(node) - 'a']++;
        List<Integer> nodesList = edgesMap.get(node);
        for (int nextNode : nodesList) {
            if (!visited[nextNode]) {
                int[] childCounts = depthFirstSearch(nextNode, counts, visited, edgesMap, labels);
                for (int i = 0; i < 26; i++) {
                    curCounts[i] += childCounts[i];
                }
            }
        }
        counts[node] = curCounts[labels.charAt(node) - 'a'];
        return curCounts;
    }
}
