package CollectionExamples.maps.linked_hash_map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "two");
        map.put(1, "one");
        map.put(3, "three");
        System.out.println(map); //maintains the inssetion order
        System.out.println(map.size()); //returns size of the map
        System.out.println(map.containsKey(3)); //return true if the map contains the key
        map.putIfAbsent(4, "four");
        map.computeIfAbsent(4, k->map.get(3)+10); //not comuted four is already present
        System.out.println(map); 
    }
}
