package Array;

import java.util.Scanner;

public class First_repeted_number {
    static int findfirstrepeted(int [] arr){
        for(int i = 0; i < arr.length;i++ ){
            for (int j = i+1; j < arr.length;j++ ){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findfirstrepeted(arr));

    }

}
