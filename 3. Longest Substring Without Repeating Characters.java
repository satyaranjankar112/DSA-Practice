class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int low = 0, max = 0;

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);

            low = Math.max(low, freq[ch]);
            max = Math.max(max, high - low + 1);

            freq[ch] = high + 1;
        }

        return max;
    }
}