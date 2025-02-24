import java.util.Scanner;

public class palindrome_number {
    static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while (temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if (rev == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        // ex: n = 121
        int n = sc.nextInt();
        if (isPalindrome(n)){
            System.out.println("Palinddrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    

}
