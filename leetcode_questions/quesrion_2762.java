public class quesrion_2762 {
    public static void main(String[] args) {
        int[] nums = {5,4,2,4};
        System.out.println(continousSubarr(nums));
    }
    static long continousSubarr(int[] nums){

        // int left = 0;
        // int subCountArr = 0;
        // int max = 0;
        // int min = 0;
        // for(int right = 0; right < nums.length; right++){
        //     max = Math.max(max, nums[right]);
        //     min = Math.min(min, nums[right]);
        //     while(max - min > 2){

        //     }
        // }


        long ans = 0;
        int n = nums.length;
        for(int i = 0; i < n;  i++){
            int min = nums[i];
            int max = nums[i];
            for(int j = i; j < n; j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                if(max - min <= 2){
                    ans++;
                } else {
                    break;
                }
            }
        }


        return ans;
    }
}
