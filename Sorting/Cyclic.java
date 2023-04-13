package Sorting;

import java.util.Scanner;

public class Cyclic {
    static void cyclicsort(int[] arr){
        int i = 0;
        while(i  < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
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
        cyclicsort( arr);
        System.out.println("Array after the sorting");
        for(int i= 0; i<s;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
