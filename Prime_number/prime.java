import java.util.Scanner;

public class prime {
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
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if (n <= 0){
            System.out.println("Input Error");
        }
        else if (prime_check(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
