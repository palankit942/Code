package Searching;
import java.util.Scanner;

public class Binary {
    public static int binary(int [] arr, int x, int n){
       int start = 0;
       int end = n - 1;
       while (end >=  start){
           int mid =(start + end)/2;
           if(x == arr[mid]){
               return mid;
           }else if (arr[mid] > x){
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return  -1;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the array");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Searching element : ");
        int x = sc.nextInt();

        int res = binary(arr,x,n);
        if(res == -1)
            System.out.println("not present in array");
        else
            System.out.println("present at index : " + res);
    }

}

