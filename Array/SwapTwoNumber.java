package Array;

import java.util.Scanner;

public class SwapTwoNumber {
     public static void swap(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
         System.out.println("Before swap :- " + x +"  " + y);
         System.out.println("After swap :- " + x +"  " + y );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int x = sc.nextInt();
        System.out.println("enter the second number");
        int y = sc.nextInt();

        swap(x,y);



    }

}
