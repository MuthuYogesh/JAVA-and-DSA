import java.util.Arrays;
import java.util.Scanner;


public class arraysum {
    static Scanner obj = new Scanner(System.in);
    static int[] get_array(int n){
        int[] array1 = new int[n];
        for (int i=0; i < array1.length; i++){
            System.out.print("Enter the " + (i+1) + " number: ");
            array1[i] = obj.nextInt();
        }
        return array1;
    }
    // If we name method as same as class name then it'll be treated as constructor
    static int sum(int[] array1){
        int sum = 0;
        for (int i=0; i < array1.length; i++){
            sum += array1[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number to define Array Size: ");
        int n = obj.nextInt();
        int[] array1 = get_array(n);
        int sum = sum(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Sum of Array Elemtents:" + sum);
    }
}

