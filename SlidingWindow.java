public class SlidingWindow {
    public static int maxSumWindow (int[] arr, int s){
        int n = arr.length;
        int l = -1;
        int sum = 0, maxlen = 0;

        for (int r=0; r<n; r++){
            sum += arr[r];
            if(sum >= s){
                sum -= arr[++l];
            }
            maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(maxSumWindow(arr, 20));
    }
}
