import java.util.Scanner;
import java.util.HashMap;
public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        HashMap <Short, Integer> map = new HashMap<>();
        int count = 1;
        for (int i =0; i< n; i++){
            short x = sc.nextShort();
            if (map.get(x) == null){
                map.put(x, count);
            } 
            else if (map.get(x) == x){
                count++;
                map.put(x, count);
            }
        }
        System.out.println(map);
    }
}
