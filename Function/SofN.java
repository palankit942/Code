package Function;

import java.util.Scanner;
//Program to find sum of first n natural numbers
// Given a number n, find the sum of first natural numbers.
public class SofN {
     static int sofn(int n){
        int sum = 0;
        for(int i = 1; i<= n;i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
         int ans =sofn(a);
        System.out.println("sum of the number :- "+ ans);
    }
}
