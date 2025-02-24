import java.util.Scanner;

public class tcs {
    static int fw(int tv, int w){
        int fw = (w-2*tv)/2;
        return fw;
    }
    static int tw(int tv, int fw){
        int tw = tv - fw;
        return tw;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tv = obj.nextInt();
        int w = obj.nextInt();
        int fw = fw(tv,w);
        System.out.println(fw);
        System.out.println(tw(tv,fw));
    }
}
