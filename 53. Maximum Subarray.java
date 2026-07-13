class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int bestend = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            int b1 = bestend + nums[i];
            int b2 = nums[i];
            bestend = Math.max(b1,b2);
            ans = Math.max(ans,bestend);
        }
        return ans;
    }
}