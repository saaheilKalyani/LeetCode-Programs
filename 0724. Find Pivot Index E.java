class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0; 
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i]; 
        }
        int left = 0;
        if ((sum - nums[0] - left) == 0)  return 0; 
        for (int i = 1; i < nums.length; i++) {
            left += nums[i-1]; 
            if ((sum - nums[i] - left) == left  ) return i;  
        }
        return -1; 
    }
}