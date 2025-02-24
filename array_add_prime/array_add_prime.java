import java.util.Arrays;

public class array_add_prime {
    static boolean prime_check(int n){
        if (n == 2){
            return false;
        }
        for (int i=2; i<n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i < arr1.length; i++){
            if (prime_check(i)){
                continue;
            }
            else{
                arr1[i] = arr1[i] + 5;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
