/* PS:2 Treasure Hunt */

import java.util.Scanner;

public class problem2 {
    public static int distict (String s){
        int[] arr = new int[26];
        int l = -1;
        int n = s.length();
        int maxlen = 0;
        for (int r=0; r<n; r++){
            arr[s.charAt(r) - 97]++;
            while(arr[s.charAt(r) - 97]>1){
                l++;
                arr[s.charAt(l) - 97]--;
            
            }
            maxlen = Math.max(maxlen, r-l);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();                   // A string s (the encoded map).
        System.out.println(s);
        System.out.println("length of the longest substring with unique characters: " + distict(s.toLowerCase()));
        // System.out.println('a' - 97);
    }
}
