package practice;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibbnoci {
    public static int  fibb(int n){
        int res;
        if(n == 0){
            return 1;
        }else {
            return res = n*fibb(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = fibb(a);
        System.out.println(ans);
    }
}
