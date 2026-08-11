class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length; 
        boolean[] arr = new boolean[len];
        int result = 0;  
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0 && nums[i] <= len) 
                arr[nums[i] - 1] = true; 
        }
        for (int i = 0; i < len; i++) {
            if (!arr[i]) {
                result = i+1; break; 
            }
        }
        if (result == 0) {result = len + 1;} 
        return result; 
    }
}
