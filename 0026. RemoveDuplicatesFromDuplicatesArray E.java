class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int cnt = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String args[]) {
        int []nums={1,1,2};
        int cnt = removeDuplicates(nums);
        System.out.print(cnt+", nums = [");
        for (int i=0; i<nums.length; i++) {
            if (i < cnt)
                System.out.print(nums[i]);
            else
                System.out.print("_"); 
            if (i < nums.length - 1)
                System.out.print(",");
        }
        System.out.print("]");

    }
}