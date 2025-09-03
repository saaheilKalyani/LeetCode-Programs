class Solution {
    public static int removeElement(int[] nums, int val) {
        int cnt=0; 
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[cnt] = nums[i];
                cnt++;
            } 
        }
        return cnt;
    }

    public static void main(String args[]) {
        int []nums={3,2,2,3};
        int val=3;
        int cnt=removeElement(nums,val);
        System.out.print(cnt + ", nums = [");
        for (int i=0; i<nums.length; i++) {
            if (i < cnt) {
                System.out.print(nums[cnt]);
            }
            else {
                System.out.print("_");
            }
            System.out.print(",");
        }
    }
}