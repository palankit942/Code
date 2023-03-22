package practice;

import java.util.Scanner;

public class removeDuplicateFromanAarray {
     static  int removeDuplicate(int[] arr, int n){
        int res =1;
        for(int i =1;i< n;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
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
        n= removeDuplicate(arr,n);
        System.out.println("duplicate element : ");
        for(int i =0; i<n;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
