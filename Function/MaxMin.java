package Function;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class MaxMin {
    static int max(int n1, int n2){
        if(n1>n2){
            return n1;
        }else if(n2>n1){
            return n2;
        }else if(n1 ==n2){
            return 0;
        }
        return 0;
    }
    static int min(int n1, int n2){
        if(n1>n2){
            return n2;
        }else if(n2>n1){
            return n1;
        }else if(n1 ==n2){
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("maximum number is :- " +max(a,b));
        System.out.println("minimum number is :- " +min(a,b));



    }
}
