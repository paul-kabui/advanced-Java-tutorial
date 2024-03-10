package CollectionExamples.maps.hashmaps;

import java.util.HashMap;

/*
 * Map is like a dictionary in python or c sharp
 * has a key(Must be unique) and value
 * there a three types of map in java
 *  1.HashMap -> doesnot maintain the insertion order, it sorts them
 *  2.LinkedHashMap -> maintains the inssertion order and unique element
 *  3.treeMap
 * 
 * they depend on data stucture
*/
public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "two");
        map.put(1, "one");
        map.put(3, "three");
        
        System.out.println(map.getOrDefault(1, "default one"));
        System.out.println(map.entrySet());
        map.replace(3, "replaced3");
        System.out.println(map);
        System.out.println(map.keySet()); //list of keys

        
        // iteration method 1
        System.out.println("\ninterating method 1\n");
        for (Integer key : map.keySet()) {
            System.out.printf("key: %d, Value: %s\n",key,map.get(key));
        }
        
        // iteration method 2
        System.out.println("\n\ninterating method 1\n");
        map.forEach((k,v) -> {
            System.out.printf("key:%d, value: %s \n", k,v);
        });
        
        /*
        *you can use other method such as foreach stream and iterator
        */
        map.remove(3); //remove item using key
        System.out.println(map);

        map.clear(); //clear all items in the map
        System.out.println(map.isEmpty());


        // computeifpresent -> Only compute when the key is available
        //computeIfAbsent -> Only computes even if the key not there and adds the key after computation
    }
}
