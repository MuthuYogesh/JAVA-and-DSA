import java.util.Scanner;

public class factorial {
    static int get_fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = obj.nextInt();
        int fact = get_fact(n);
        System.out.println(fact);;
    }
}
