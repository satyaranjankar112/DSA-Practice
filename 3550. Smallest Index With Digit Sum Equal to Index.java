class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int index=-1;
        for (int i = 0; i < n; i++){
            int sum = 0;
            while (nums[i] > 0){
                sum += nums[i] % 10;
                nums[i] /= 10;
            }
            if (sum == i){
                if(index==-1||i<index)
                    index=i;
            }
            
        }
        return index;
    }
}