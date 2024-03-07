package tutorials.dataTypes;
import java.util.Arrays;
import java.util.Scanner;

public class DataTypesTutorial{
    public static String test(){
        String a = "hello";
        String b = "world";
        return a.concat(b);
    }
    public static int ageCalculator(){
        System.out.print("Enter your birth Year:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int current_year = 2014;
        int calculated_age =  current_year - age;
        return calculated_age;
    }
    public static void main(String[] args){
        // immutable data types, all primitive data is immutable
        int a = 12;
        a =13;
        // N/B: do not use == operators to compare, bigDecimals ang strings
        String str = new String("hello");
        String str2 = "hello";
        if(str.equals(str2)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

        //mutable string, you can change the string
        StringBuffer str3 = new StringBuffer("paul"); 
        str3.append(a);

        // Arrays
        int[] numbers = new int[]{1,2,3,4};
        Arrays.toString(numbers);
        for (int number : numbers) {
            System.out.println(number*6);
        }
    }
}