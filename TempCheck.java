import java.util.Scanner;
import java.util.ArrayList;

public class TempCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp;
        ArrayList <Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++){
            temp = sc.nextInt();
            list.add(i, temp);
        }
        temp = list.get(0);
        for (int i=0; i<n; i++){
            if (temp <= list.get(i)){
                temp = list.get(i);
            }
        }
        System.out.println(temp);
    }
}
