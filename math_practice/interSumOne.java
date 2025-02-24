
import java.util.Scanner;

public class interSumOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n > 10){
            while(n > 0){
                int rem = n % 10;
                sum += rem;
                n = n/10;
                System.out.println("1");
            }
            n = sum;
            System.out.println("2");
        }
        System.out.println("Sum: " + n);
    }
}
