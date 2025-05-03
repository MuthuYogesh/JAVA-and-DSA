import java.util.Arrays;

public class moveNonZeros {
    public static int[] move (int[] nums){
        int n = nums.length;
        int l = 0;
        for(int r=0; r<n; r++){
            if (nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 12, 0, 1};                             // 1, 1, 1, 12, 0, 0, 0, 1    1, 1, 1, 12, 1, 0, 0, 0
        System.out.println(Arrays.toString(move(arr)));                    //              l        r 
    }
}
