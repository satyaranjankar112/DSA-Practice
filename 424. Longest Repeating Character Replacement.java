class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int res = 0;
        int max = 0;
        int n = s.length();
        int[] f = new int[256];

        for (int high=0; high<n; high++){
            char ch = s.charAt(high);
            f[ch]++;
            int len = high-low+1;
            max = Math.max(max,f[ch]);
            int diff = len-max;

            while(diff>k){
                char left = s.charAt(low);
                f[left]--;
                low++;
                len = high-low+1;
                diff = len-max;
            }

            if (diff<=k){
                len = high-low+1;
                res = Math.max(res,len);
            }
        }
        
        return res;
    }
}