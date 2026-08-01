class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;

        boolean[] one = new boolean[MAX];
        boolean[] two = new boolean[MAX];
        boolean[] three = new boolean[MAX];

        
        for (int num : nums) {
            one[num] = true;
        }

        
        for (int i = 0; i < MAX; i++) {
            if (!one[i]) continue;
            for (int j = 0; j < MAX; j++) {
                if (!one[j]) continue;
                two[i ^ j] = true;
            }
        }

        
        for (int x = 0; x < MAX; x++) {
            if (!two[x]) continue;
            for (int j = 0; j < MAX; j++) {
                if (!one[j]) continue;
                three[x ^ j] = true;
            }
        }

        int ans = 0;
        for (boolean b : three) {
            if (b) ans++;
        }

        return ans;
    }
}