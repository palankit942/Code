package Array;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

public class pairSum {

  public static void pairsum(int[] arr, int target ) {
       for (int i = 0; i < arr.length - 1; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] + arr[j] == target) {
                   System.out.printf("pair found(%d,%d)", arr[i], arr[j]);
                   return;
               }
           }
       }
       System.out.println("Pair not found");
       return;
   }

//    public static int[] pairsum(int[] nums, int target) {
//        int n=nums.length;
//        Map<Integer,Integer> map=new HashMap<>();
//        int[] result=new int[2];
//        for(int i=0;i<n;i++){
//            if(map.containsKey(target-nums[i])){
//                result[1]=i;
//                result[0]=map.get(target-nums[i]);
//                return result;
//            }
//            map.put(nums[i],i);
//        }
//        return result;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("entet the target");
        int target = sc.nextInt();
        out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pairsum(arr,target);

    }

}
