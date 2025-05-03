

public class palindrome {
    public static boolean check(String str1, String str2){
        boolean flag = false;
        StringBuilder newstr = new StringBuilder(str2);
        newstr.reverse();
        if (str2.equals(str1)){
            return true;
        }
        return flag;
    }
    public static void main(String[] args) {
        String str1 = new String("racecar");
        String str2 = new String("racecar");
        if (check(str1, str2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
