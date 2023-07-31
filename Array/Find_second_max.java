package Array;

import java.util.Scanner;

public class Find_second_max {

    static int findmax(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i=0; i < arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }

    static int findsecondmax(int[] arr){
        int max = findmax(arr);
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findsecondmax(arr));

    }
}
