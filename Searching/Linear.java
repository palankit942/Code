package Searching;
import java.util.Scanner;

public class Linear {
    public static int linear(int[] arr, int x ,int n){
        for(int i =0 ; i < n ; i++){
            if(arr[i] == x){
                return i;
            }
         }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the array");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Searching element : ");
        int x = sc.nextInt();

        int res = linear(arr,x,n);
        if(res == -1)
            System.out.println("not present in array");
        else
            System.out.println("present at index : " + res);
    }

}
