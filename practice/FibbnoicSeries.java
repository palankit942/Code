package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibbnoicSeries {
    public static int fibb(int n){
        int res;
        if(n <=0){
            return 0;
        }else if(n==1){
            return 1;
        }
        else{
            return fibb(n-1)+ fibb(n-2);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = fibb(a);
        System.out.println(ans);
        //   System.out.println(ans);
    }

}
