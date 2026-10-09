class Solution {
    public int minInsertions(String s) {
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(')
                cnt++;
            else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')')
                    i++;
                else 
                    ans++;
                if (cnt > 0 )
                    cnt--;
                else
                    ans++;
            }
        }
        return ans + cnt * 2;
    }
}