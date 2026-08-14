class Solution {
    public int maximumLengthSubstring(String s) {
        int low = 0;
        int res = 0;
        int[] f = new int [26];
        for (int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            f[ch - 'a']++;
            while (f[ch - 'a'] > 2){
                f[s.charAt(low) - 'a']--;
                low++;          
            }
            res = Math.max(res, high - low + 1);
        }
        return res;
    }
}