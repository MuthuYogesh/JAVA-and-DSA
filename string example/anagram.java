import java.util.Arrays;;

public class anagram {
    public static boolean check(String str1, String str2){
        char[] charstr1 = str1.toCharArray();
        char[] charstr2 = str2.toCharArray();
        Arrays.sort(charstr1);  // Performs Dual-Pivot Quicksort with O(nlogn) Time complexity
        Arrays.sort(charstr2);
        // System.out.println(Arrays.toString(charstr1));
        // System.out.println(Arrays.toString(charstr2));
        // System.out.println(Arrays.equals(charstr1, charstr2));
        return Arrays.equals(charstr1, charstr2);
    }
    public static void main(String[] args) {
        String str1 = new String("Race"); //Space complexity O(n)
        String str2 = new String("care"); //Space complexity O(n) | O(2n) = O(n)
        if (check(str1.toLowerCase(), str2.toLowerCase())){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
