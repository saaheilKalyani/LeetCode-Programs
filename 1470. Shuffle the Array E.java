class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length]; 
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length/2; i++) {
            arr[j] = nums[i]; 
            j++; 
            arr[j] = nums[i+n]; 
            j++; 
        }  
        return arr; 
    }
}