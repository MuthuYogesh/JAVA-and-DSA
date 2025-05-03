import java.util.Arrays;


public class twoSum {
    public static int[] solution(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;                                    // Using Binary search
        int[] a = new int[2];
        while(l < r){
            int sum = nums[l] + nums[r];
            int mid = l + (r - l) / 2;
            if(sum == target){
                a[0] = l + 1;
                a[1] = r + 1;
                return a;
            }
            else if (sum < target){
                if (nums[mid] + nums[r] < target){
                    l = mid + 1;
                }
                else{
                    l++;
                }
            }
            else{
                if (nums[mid] + nums[l] > target){
                    r = mid -1;
                }
                else{
                    r--;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution(arr, target)));
    }
}
