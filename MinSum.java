public class MinSum {
    static int minsum(int[] arr, int k){
        int n = arr.length;
        int minSum, currentSum = 0;
        for (int i=0; i<k; i++){
            currentSum += arr[i];
        }
        minSum = currentSum;
        for (int i=k; i<n; i++){
            currentSum += arr[i] - arr[i-k];
            // System.out.println(currentSum);
            if (currentSum < minSum){
                minSum = currentSum;
            }
        }
        return minSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 3, 6, 7, 9, 1, 5};   // 1-9, 2-11, 3-14, 4-16, 5-22, 6-17, 7-15
        int k = 3;

        System.out.println(minsum(arr, k));
    }
}
