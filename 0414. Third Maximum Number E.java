class Solution {
    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE; 
        long m2 = Long.MIN_VALUE; 
        long m3 = Long.MIN_VALUE; 
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==m1 || nums[i]==m2 || nums[i]==m3 ) continue;
            else if (nums[i] > m1 && nums[i] > m2 && nums[i] > m3) {
                m1 = m2; 
                m2 = m3;
                m3 = nums[i]; 
            } else if (nums[i] > m1 && nums[i] > m2 && nums[i] < m3) {
                m1 = m2; 
                m2 = nums[i]; 
            } else if (nums[i] > m1 && nums[i] < m2 && nums[i] < m3) {
                m1 = nums[i]; 
            }
        }
        if (m1 == Long.MIN_VALUE)
            return (int)m3;

        return (int)m1;
    }
}