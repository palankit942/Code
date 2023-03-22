package Function;

import java.util.Scanner;

public class Palindrome {
    static boolean palindrome(int n) {
        int temp =n,rem, sum =0;
    while (n != 0){

        rem =n%10;
         sum =(sum*10)+rem;
         n = n/10;
        }
    if (temp == sum){
        return true;
    }else {
        return false;
    }
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        boolean ans= palindrome(a);
        System.out.println("Number is :-  "+ans);
    }
}