package Sorting;

import java.util.Scanner;

public class Insertition {
    static void insertition (int[] arr, int n){
        for(int i = 1; i< n; i++){
            int key =  arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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
        insertition( arr, s);
        System.out.println("Array after the sorting");
        for(int i= 0; i<s;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
