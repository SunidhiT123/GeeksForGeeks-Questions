class Solution {
    public static int nSum(int n) {
        if(n<=0){
            return 0;
        }
        return n+nSum(n-1);
    }
}
