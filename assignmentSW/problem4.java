import java.util.Scanner;
import java.util.HashMap;

public class problem4 {
    public static int subString (String s, int k){
        int l = -1;
        int maxlen = 0;
        String[] arr = s.split(" ");
        int n = arr.length;
        HashMap <String,Integer> mp = new HashMap<>();
        for (int i=0; i<n; i++){
            
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            System.out.println("1" + mp);

            while (mp.keySet().size() > k){
                l++;
                mp.put(arr[l], mp.getOrDefault(arr[l], 0) - 1);
                if (mp.get(arr[l]) == 0){
                    mp.remove(arr[l]);
                }
                
                
            }
            System.out.println("2" + mp);
            maxlen = Math.max(maxlen, i-l);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();                           // A string s containing words separated by spaces
        int k = sc.nextInt();                               // An integer K (maximum distinct words allowed).
        
        System.out.println("The length of the longest valid substring: " + subString(s, k));
    }
}
