import java.util.Arrays;
import java.util.Scanner;

public class sum {
    static int[] Solution(int[] arr, int[] idx, int N){
        int n = arr.length;
        int prefixSum = 0;
        int[] psarr = new int[n];
        for(int i=0; i<n; i++){ 
            prefixSum += arr[i];
            psarr[i] = prefixSum;
        }
        int[] sol = new int[N];
        for(int i=0; i<N; i++){
            sol[i] = psarr[idx[i]];
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] narr = new int[n];
        for (int i=0; i<n; i++){
            narr[i] = sc.nextInt();
        }
        
        System.err.println(Arrays.toString(Solution(arr, narr, n)));
    }
}
