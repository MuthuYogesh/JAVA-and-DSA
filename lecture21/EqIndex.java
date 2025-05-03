

public class EqIndex {
    static int solution(int[] arr){
        int n = arr.length;
        int prefixSum = 0;
        int[] psarr = new int[n];
        for(int i = 0; i<n; i++){
            prefixSum += arr[i];
            psarr[i] = prefixSum;
        }
        for (int i=0; i<n; i++){
            if (psarr[i] > (psarr[n-1]/2)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(solution(arr));
    }
}
