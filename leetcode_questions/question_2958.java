import java.util.HashMap;
import java.util.Map;

public class question_2958 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        System.out.println(maxSubarrayLength(nums, 2));

    }
    static int maxSubarrayLength(int[] nums, int k) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int maxlength = 0;
        for(int right = 0; right < nums.length; right++){

            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while(freq.get(nums[right]) > k){
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
