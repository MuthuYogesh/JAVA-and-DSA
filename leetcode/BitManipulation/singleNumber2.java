

public class singleNumber2 {
    public static int solution(int[] nums){
        int x1 = 0;
        int x2 = 0;
        int mask = 0;
        for(int num: nums){
            x2 ^= (x1 & num);
            x1 ^= num;

            mask = ~(x1 & x2);
            x2 &= mask;
            x1 &= mask;
        }
        return x1 | x2;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3,1,2};
        System.out.println(solution(nums));
    }
}
