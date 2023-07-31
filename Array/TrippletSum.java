package Array;

import java.util.Scanner;

import static java.lang.System.out;

public class TrippletSum {
    static int find3Numbers(int A[], int n, int X) {

        // Your code Here
        int ans=0;
        for(int i = 0 ;i<n; i++){
            for(int j =i+1; j< n;j++){
                for(int k= j+1;k<n;k++){
                    if(A[i] + A[j] + A[k]==X){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        out.println("entet the target");
        int target = sc.nextInt();

        out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        out.println(find3Numbers(arr,n,target));

    }
}
