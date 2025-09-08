class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i=1; i<n; i++) {
            int no=n-i; 
            if (notZero(no) && notZero(i)) {
                return new int[]{i,no};
            }
        }
        return new int[]{};
    }
    public boolean notZero(int no) {
        while (no > 0) {
            if (no % 10 == 0) {
                return false; 
            }
            no = no / 10; 
        }
        return true; 
    }
}