import java.util.Scanner;

public class doNot {
    static String doNot(String s){
        return "do not " + s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(doNot(s));
    }
}
