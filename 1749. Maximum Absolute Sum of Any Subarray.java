class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int s = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            s += a;
            min = Math.min(min,s);
            max = Math.max(max,s);
        }
        return max - min;
                                    
    }
}