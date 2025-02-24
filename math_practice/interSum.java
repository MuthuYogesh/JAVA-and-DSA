import java.util.Scanner;
import java.lang.Math;
public class interSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int sum =0;
        while(n!=0){
            int rem = n % 10;
            sum += rem;
        }
        System.out.println("Sum: " + sum);
    }
}
