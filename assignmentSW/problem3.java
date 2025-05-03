
import java.util.Scanner;

public class problem3 {
    public static int spiceLevel (int[] nums, int n, int k){
        int l = -1;
        int minlen = n;
        int sum = 0;

        for (int r=0; r<n ; r++){              // {2, 1, 5, 2, 3, 2}
            sum += nums[r];                    //  0  1  2  3  4  5
            while (sum >= k){
                l++;
                sum -= nums[l];
                minlen = Math.min(minlen, r-l+1);
            } 
        }
        return minlen == n-1?-1:minlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int[] arr = new int[N];
        // for (int i = 0; i < N; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int k = sc.nextInt();
        int N = 6;                                     // An integer N (number of ingredients).
        int[] arr = {2, 1, 5, 2, 3, 2};                // An array arr of size N where arr[i] represents the spiciness level of the i-th ingredient
        int k = 7;                                     // An integer K (minimum spiciness level required).

        System.out.println("Minimum No. of Ingreddints adding up to " + k + " spice level: " + spiceLevel(arr, N, k));
    }
}
