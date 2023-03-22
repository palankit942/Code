package Array;
// is unique implement an algorithem to determine if a string has all unique characters. what if you cannot use additional data structurea?

import java.util.Scanner;

public class IsUnique {
    static boolean isunique(String s){
        if(s.length() > 128)
            return false;
        boolean[] char_set = new boolean [128];
        for (int i = 0; i<s.length();i++){
            int val = s.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;

    }
// second method//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string");
        String  str = sc.nextLine();
        boolean ans = isunique(str);
        System.out.println(ans);
    }

}
