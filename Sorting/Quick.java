package Sorting;

import java.util.Scanner;

public class Quick {
    static void quick(int[] arr , int n){
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int s = sc.nextInt();
        System.out.println("Enter the array element : ");
        int arr[] = new int[s];
        for(int i =0; i< s;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before the sorting");
        for(int i= 0; i<s;i++){
            System.out.println(arr[i] +" ");
        }
        quick( arr, s);
        System.out.println("Array after the sorting");
        for(int i= 0; i<s;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
