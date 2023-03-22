package Function;
//Pythagorean Triplet in an array
//Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
import java.util.Scanner;

public class PythagoreanTriplates {
    public static boolean pyTriplate(int arr[], int n){
        for (int i= 0; i<n ; i++){
            for(int j =i+1;j<n;j++){
                for (int k= j+1; k<n;k++){
                    int a = arr[i]* arr[i];
                    int b = arr[j]* arr[j];
                    int c = arr[k]* arr[k];
                    if( a == b+c || b == a+c || c == a+b){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter the array element");
        int arr[]= new int[size];
        for (int i = 0; i< size;i++){
            arr[i] = sc.nextInt();
        }
        if (pyTriplate(arr, size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
