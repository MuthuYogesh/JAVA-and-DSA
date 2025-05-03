

public class SumDigits {
    public static int sum(int n){
        if(n<10){
            return n;
        }
        return sum(n%10) + sum(n/10);
    }
    /*
    8 + 56
    8 + 6 + 5
    */
    public static void main(String[] args) {
        int n = 568;
        System.err.println(sum(n));
    }
}
