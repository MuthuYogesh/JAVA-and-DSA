import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    static Scanner sc = new Scanner(System.in);

    static int[] getarray(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int[] array_out(int n, int[] arr){
        int[] brr = new int[n];
        for (int i = 0; i < n; i++){
            if (arr[i] > 10){
                brr[i] = arr[i] - 5;
            }
            else{
                brr[i] = arr[i];
            }
        }
        return brr;
    }

    public static void main(String[] args) {
        
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        // Get Array
        int[] arr = getarray(n);
        // int[] brr = new int[n];

        // Subtracting 5 from elements greater than 10
        int[] brr = array_out(n, arr);
        
        // Printing New O/P Array
        System.out.println(Arrays.toString(brr));

    }
}
