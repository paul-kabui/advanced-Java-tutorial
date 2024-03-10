package CollectionExamples.maps.treemaps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // SortedMap<Integer, String> treeMap=  new TreeMap<>();
        TreeMap<Integer, String> treeMap=  new TreeMap<>();
        treeMap.put(10, "ten");
        treeMap.put(4, "four");
        treeMap.put(1, "one");
        treeMap.put(12, "twelve");

        System.out.println(treeMap);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "ten");
        map.put(4, "four");
        map.put(1, "one");
        map.put(12, "twelve");

        System.out.println(map);
    }
}
