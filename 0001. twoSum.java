import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            int arr[] = new int[2]; 
            arr[0]=i;
            for (int j=i+1; j<nums.length; j++) {
                int sum=nums[i]; 
                
                sum+=nums[j];
                if (sum == target) {
                    arr[1] = j;
                    return arr;
                }
            }

        }
        return null;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nums[] ={2,3,4,5};
        int target=5;
        int start[] = twoSum(nums, target);
        System.out.print("[");
        for (int i=0; i<2; i++) {
            System.out.print(start[i]);
        }
        System.out.print("]");
        
    }
}