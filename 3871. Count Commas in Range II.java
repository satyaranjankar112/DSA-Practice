class Solution {

    static final long[] pow1000 = {
        1000L,
        1000000L,
        1000000000L,
        1000000000000L,
        1000000000000000L,
        1000000000000000000L
    };

    public long countCommas(long n) {

        long ans = 0;

        for (int i = 0; i < pow1000.length; i++) {
            if (n >= pow1000[i]) {
                ans += n - pow1000[i] + 1;
            }
        }

        return ans;
    }
}