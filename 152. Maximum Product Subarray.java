class Solution {
    public int maxProduct(int[] nums) {
        int maxend = nums[0];
        int minend = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++){
            int b1 = nums[i];
            int b2 = maxend*nums[i];
            int b3 = minend*nums[i];
            maxend = Math.max(b1,Math.max(b2,b3));
            minend = Math.min(b1,Math.min(b2,b3));
            ans = Math.max(ans,Math.max(maxend,minend));
        }
        return ans;
    }
}