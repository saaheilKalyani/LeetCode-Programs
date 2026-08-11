class Solution {
    public int[] buildArray(int[] nums) {
        int j = 0; 
        int arr[] = new int[nums.length]; 
        for (int i = 0; i < nums.length; i++) {
            arr[j] = nums[nums[i]]; 
            j++;
        }
        return arr; 
    }
}