class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2; 
        int arr[] = new int[n]; 
        int j=0; 
        for (int i = 0; i < nums.length; i++) {
            arr[j] = nums[i];
            int k = j + nums.length; 
            arr[k] = nums[i]; 
            j++; 
        }
        return arr;
    }
}