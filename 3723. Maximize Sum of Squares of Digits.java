class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * sum) 
            return "";
            StringBuilder ans = new StringBuilder();
            while (num-- > 0){
                int digit = Math.min(9, sum);
                ans.append(digit);
                sum -= digit;
            }
            if (sum == 0)
                return ans.toString();
            else
                return "";
    }
}