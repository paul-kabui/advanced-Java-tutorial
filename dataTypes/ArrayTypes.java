package tutorials.dataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class ArrayTypes {
    public static void ArrayExamples(){
        // ARRAYS AND LISTS
        // List<String> lst = new ArrayList<>();
        // convert this into a list
        Integer[] intArray = {1,2,3,4,5};
        List<Integer> lst = new ArrayList<>(Arrays.asList(intArray));
        lst.add(6);
        //method 2: using collection
        String[] str1 = {"paul", "mwangi", "kabui"};
        List<String> listStr = new ArrayList<>();
        listStr.addAll(Arrays.asList(str1));
        listStr.add("phauz");
        String str2 = listStr.toString();
        for (String string : listStr) {
            System.out.println(string);
        }
    }
    public static void setExamples(){
        //java collection framework
        List <String> list = Arrays.asList("paul","mwangi","paul");
        Set <String> set = new HashSet<>(list); //set
        List<String> list2 = new ArrayList<>(list); //same as list
        // using listInterator
        // ListIterator<String> listInterator = list.listIterator();
        // while(listInterator.hasNext()){
        //     System.out.println(listInterator.next());
        // }
        // Integer[] listInt = {1,2,3,4};
        // List<Integer> lstInt = new ArrayList<Integer>(Arrays.asList(listInt));
        // lstInt.remove(2);
        // System.out.println(listInt);
        // find even number
        // lstInt.forEach((integer)-> {
        //     if(integer%2==0){
        //         System.out.println(integer);
        //     }
        // });
        Set <String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");
        set1.add("1");
        for (String string : set1) {
            System.out.println(string);
        }
    }
    public static void map(){
        // map is the same as dictionnary
        Map<String, Integer> salary = new HashMap<>();
        salary.put("paul", 45_000); 
        salary.put("Kabui", 60_000);
        salary.forEach((key, value) -> System.out.println(key));
    }

    public static void main(String[] args){
        setExamples();
        // map();
        
    }   
}