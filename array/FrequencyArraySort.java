import java.util.Arrays;

public class FrequencyArraySort{

    static int[] input_array (){
        int[] array1 = {10, 20, 10, 10, 20, 30, 30, 30, 30, 0};
        return array1;
    }
    
    static int[] freqSortArray(int[] a){
        int arr[][] = new int[MAX][2];
        int brr[][] = new int[MAX][2];
        int n = a.length;
        int k = 0, temp = 0;
        
        for (int i=0; i < n; i++){
            arr[i][0] = a[i];
            arr[i][1] = 0;
        }
        for (int i=0; i<n; i++){
            if (arr[i][1]==1){
                continue;
            }
            int count = 1;
            for (int j=i+1; j<n; j++){
                if (arr[i][0] == arr[j][0]){
                    arr[j][1] = 1;
                    count++;
                }
            }
            brr[k][0] = arr[i][0];
            brr[k][1] = count;
            k++;
        }
        n = k;
        for (int i=0; i < n-1; i++){
            temp = brr[i][1];
            for (int j = i+1; j < n; j++){
                if (temp < brr[j][1]){
                    temp = brr[j][1];
                    brr[j][1] = brr[i][1];
                    brr[i][1] = temp;

                    temp = brr[j][0];
                    brr[j][0] = brr[i][0];
                    brr[i][0] = temp;
                }
            }
        }

        // Freqency of elements
        for (int i=0; i < k; i++){
            System.out.println("Original brr: " + brr[i][0] + " " + brr[i][1]);
        }

        System.out.println();

        int[] new_arr = new int[a.length];
        int l = 0;
        k = 0;
        temp = 0;
        while (l != a.length){
            if (k >=brr.length){
                break;
            }
            temp = brr[k][1];
            while (brr[k][1] != 0){
                new_arr[l] = brr[k][0];
                brr[k][1]--;
                l++;
                // System.out.println("K1: " + k);
                // System.out.println("l: " + l);
            }
            k++;
            // System.out.println("K2: " + k);
        }
        return new_arr;
    }
    private static final int MAX = 200;
    public static void main(String[] args) {
        int a[] = input_array();
        int[] new_arr = freqSortArray(a);
        System.out.println(Arrays.toString(new_arr));
        for (int x=0; x < a.length; x++){
            System.out.println("Final array: " + new_arr[x]);
        }
    }
}
