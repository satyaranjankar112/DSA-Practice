class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '('){
                cnt++;
            depth=Math.max(depth,cnt);
            }
            if (ch == ')' ){
                cnt--;
            }
        }
        return depth;
    }
}