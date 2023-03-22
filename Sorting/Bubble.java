package Sorting;

import java.util.Scanner;

public class Bubble {
    public static void bubble(int arr[], int n){
     int  temp;
     for(int i =0; i < n-1;i++){
         for(int j = 0; j < n -i-1; j++){
             if (arr[j] > arr[j+1]) {
                 temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
         }
     }
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
        bubble( arr, s);
        System.out.println("Array after the sorting");
        for(int i= 0; i<s;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
