class Solution {
    public int singleNumber(int[] nums) {
        int res=0; 
        for (int n : nums) {
            res ^= n; // xor operator it will return 0 check again in future
        }
        return res;
    }
}