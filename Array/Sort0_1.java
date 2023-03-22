package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0_1 {
    public static void sort01(int []arr){
        int start = 0;
        int mid = 0;
        int pov= 1;
        int end = arr.length - 1;
        while (mid <= end ) {
            //current element is  0
            if (arr[mid] < pov) {
                swap(arr,start,mid);
                start++;
                mid++;
            }else if(arr[mid] > pov){
                swap(arr,mid,end);
                end--;
            }
            else {
                mid++;
            }
        }
    }
//    public void sort01(int[] nums) {
//        int l = 0;
//        int r = nums.length - 1;
//
//        for (int i = 0; i <= r;)
//            if (nums[i] == 0)
//                swap(nums, i++, l++);
//            else if (nums[i] == 1)
//                ++i;
//            else
//                swap(nums, i, r--);
//    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] =temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort01(arr);

        System.out.println("sort array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
