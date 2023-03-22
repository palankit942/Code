package Sorting;

import java.util.Scanner;

public class Slection {
    public static void slection(int arr[], int n){
        int temp;
        for(int i =0; i< n -1; i++){
            //find the  minimum element in unorderd array
            int mid_idx = i;
            for(int  j = i+1; j < n; j++) {
                if (arr[j] < arr[mid_idx]) {
                    mid_idx = j;
                }
                temp = arr[mid_idx];
                arr[mid_idx] = arr[i]; 
                arr[i] = temp;

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
        slection( arr, s);
        System.out.println("Array after the sorting");
        for(int i= 0; i<s;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
