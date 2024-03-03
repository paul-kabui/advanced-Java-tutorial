package tutorials.Loops;

import java.util.Scanner;

public class Loops {

    public void whileLoop(){
        while(true){
            System.out.print("Principal: ");
            Scanner scanner = new Scanner(System.in);
            int principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 10_000){
                while(true){
                    System.out.print("Enter the monthly Interest: ");
                    Scanner interest_scanner = new Scanner(System.in);
                    int monthlyInterest = interest_scanner.nextInt();
                    if(monthlyInterest > 0 && monthlyInterest <= 30){
                        double morgage = (principal * monthlyInterest * 12) / 100;
                        System.out.println("morgage: " + morgage);
                        break;
                    }
                    else{
                        System.out.println("Monthly interest should be in range of 1-30");
                    }
               }
               break;
               
            }else{
                System.out.println("Principal is not with range of 1k - 10k");
            }
        }
    }
    public static void forLoop(){
        // multidimensional array
        int[][] arr = {{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < arr.length; i++) {
            SecondLoop:
            for (int j = 0; j < arr[i].length; j++) {
               if(i ==1 && j==3){
                    System.out.println(arr[i][j]);
                    break SecondLoop;
               }
            }
        }


        // interate over the second loop
        // for (int i = 0; i < arr[1].length; i++) {
        //     System.out.println(arr[1][i]);
        // }

    }
    public static void main(String[] args){
        forLoop();
        
    }
}
