import java.util.Stack;
import java.util.Scanner;

public class reversewithstack {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
        char[] arr = a.toCharArray();
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        System.out.println(stack);
        System.out.print("[");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(stack.pop() + ", ");
        }
        System.out.println("]");
 
    }
}
