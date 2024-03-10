package CollectionExamples.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args){
        //intializing an array
        List<String> names = Arrays.asList("paul", "kabui", "mwangi");
        List<String> lst1 = new ArrayList<>();
        lst1.add("paul");
        String firstElement = names.get(0); // get the element at a specifield index
        System.out.println(firstElement);
        System.out.println(names.toString());
        System.out.println(String.join(" ", names)); //proper way of converting obj to string

        //removing items from a list
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            
        }

        System.out.println(names);
    }
}