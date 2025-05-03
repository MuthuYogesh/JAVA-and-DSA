import java.util.Arrays;

public class singleNumber3 {
    public static int[] solution(int[] nums){
        int x1 = 0;
        for(int num:nums){
            x1 ^= num;
        }
        int LowestBit = x1 & (-x1);
        int[] count = new int[2];
        for(int num:nums){
            if((LowestBit & num) == 0){
                count[0] ^= num;
            }
            else{
                count[1] ^= num ;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3,4};
        System.out.println(Arrays.toString(solution(nums)));
    }
}
