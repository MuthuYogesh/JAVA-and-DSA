
public class singleNumber1 {
    
    public static int solution(int[] nums){
        int x1 = 0;
        for(int num: nums){
            x1 ^= num;
        }
        return x1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        System.out.println(solution(nums));
    }
    
}
