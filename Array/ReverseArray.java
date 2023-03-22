package Array;

import java.util.Scanner;

public class ReverseArray {

    public static void  rev(int[] arr, int n){
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }
       System.out.println("reverse array ");
        for(int i =0; i<n;i++){
            System.out.println(b[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rev(arr,n);

    }
}
