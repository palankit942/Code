package Array;

import java.util.Scanner;

public class RotateKtimes {
    static int[] Rotate(int[] arr, int n, int d) {
        // code here
        d= d%n;
        int[] ans = new int[n];
        int j =0;
        for(int i =n-d; i< n ; i++){
            ans[j++] = arr[i];
        }
        for(int i =0 ;i < n-d; i++){
            ans[j++] =arr[i];
        }

         return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the step");
        int k = sc.nextInt();
        int [] ans =Rotate(arr, n, k);
        System.out.println("After the rotation of the array");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
