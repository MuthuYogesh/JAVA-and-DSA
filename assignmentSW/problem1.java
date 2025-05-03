/* PS: 1 - Thief's Heist */

import java.util.Scanner;

public class problem1 {
    public static int maxHouse(int[] nums, int N, int k){
        int l = -1;
        int sum = 0;
        int maxlen = 0;
        for (int r = 0; r<N; r++){     // 2, 3, 1, 4, 2
            sum += nums[r];
            while (sum > k){
                l++;
                sum -= nums[l];
            }
            maxlen = Math.max(maxlen, (r-l)); 
            // System.out.println("R: " + r + " L: " + l + " Maxlen: " + maxlen + " R-L: " + (r-l));
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        int N = 5;                    // An integer N (number of houses).
        // int[] arr = new int[N];
        // for (int i=0; i<N; i++){
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {2, 3, 1, 4, 2};    // An array arr of size N where arr[i] represents the weight of loot in the i-th house.
        // int k = sc.nextInt();              
        int k = 7;                      // An integer K (maximum weight the thief can carry).
        System.out.println("The maximum number of houses the thief can rob without exceeding the weight limit: " + maxHouse(arr, N, k)); 
    }
}
