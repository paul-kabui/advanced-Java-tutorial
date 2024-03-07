package ArraysExamples;

import java.util.Arrays;

public class Example1{
    public static void main(String[] args){
        String[] names = {"paul", "John", "Rozzy"};
        String[] namesCopy = {"paul", "John", "Rozzy"};
        String[] namesClone = names.clone();
        String[] names2 = names;
        System.out.println(names.equals(namesCopy)); //False , not pointing to the same memory location
        System.out.println(names.equals(namesClone)); //False
        System.out.println(names.equals(names2)); //True they refer to the same memory location

        System.out.println(Arrays.equals(names, namesClone)); //prints "true" because the elements of a and b have the same values


    }
}