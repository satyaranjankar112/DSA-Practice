class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> f = new HashMap<>();

        f.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int num : nums) {
            sum += num;

            int rem = sum % k;
            if (rem < 0)
                rem += k;

            ans += f.getOrDefault(rem, 0);
            f.put(rem, f.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}