
import java.util.HashMap;

public class PrefixSumk {
    public static int solution(int[] nums, int k){
        int count = 0;
        int prefixSum = 0;
        HashMap <Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int num:nums){
            prefixSum += num;

            if(mp.containsKey(prefixSum - k)){
                count += mp.get(prefixSum-k);
            }
            mp.put(prefixSum, mp.getOrDefault(prefixSum , 0) + 1);
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;

        System.out.println(solution(nums, k));
    }
}
