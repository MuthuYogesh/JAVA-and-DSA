import java.util.Scanner;
import java.lang.Math;
public class guess {
    static int gen_random(){
        return (int) Math.floor(Math.random()*(100-1))+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int user_num = sc.nextInt();
        int rand_num = gen_random();
        int count = 1;
        while(true){
            if (user_num == rand_num){
                System.out.println("You Win!");
                break;
            }
            else{
                System.out.println("Loser!");
                System.out.println("Remaining attempts:" + (5-count));
                user_num = sc.nextInt();
                if (count == 5){
                    System.out.println("You Lose!");
                    break;
                }
                count++;
            }
        }

    }
}
