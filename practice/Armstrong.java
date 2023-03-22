package practice;

import java.util.Scanner;

public class Armstrong {
    public static boolean armStrong(int n){
        int temp = n,rem,res = 0;
         while (temp > 0) {
             rem = temp % 10;
             res += Math.pow(rem,3) ;
              temp /=10;
         }if(res == n){
             return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = armStrong(a);
        System.out.println(ans);
    }
}
