package practice;

import java.util.ArrayList;
import java.util.Scanner;

public  class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int temp;
        //temp = a;
        //a=b;
        //b= temp;
        swap(a,b);
        System.out.println("valur of a "+ " "+a + "value of b  "+b);
    }
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a=b;
        b= temp;
    }
}