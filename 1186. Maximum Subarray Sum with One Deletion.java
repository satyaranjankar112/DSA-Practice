class Solution {
    public int maximumSum(int[] arr) {
        int onedel = Integer.MIN_VALUE;
        int nodel = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++){
            int prevnodel = nodel;
            int prevonedel = onedel;
            nodel = Math.max(nodel+arr[i],arr[i]);
            int a = 0;
            if (prevonedel == Integer.MIN_VALUE){
                a = arr[i];
            }
            else{
                a = prevonedel+arr[i];
            }
            onedel = Math.max(a,prevnodel);
            res = Math.max(res,Math.max(onedel,nodel));
        }
        return res;
    }
}