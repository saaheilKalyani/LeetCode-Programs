class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int i=0; int j=0; int k=0; 
        while (i<m && j<n) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i]; 
                k++; i++;
            } else {
                nums[k] = nums2[j]; 
                k++; j++; 
            }
        }
        while (i<m) {
            nums[k] = nums1[i];
            k++; i++; 
        }
        while (j<n) {
            nums[k] = nums2[j];
            k++; j++;
        }
        for (i=0; i<(m+n); i++) {
            nums1[i] = nums[i]; 
        }
    }
    public static void main (String args[]) {
        int []nums1={1,2,3,0,0,0};
        int m=3; 
        int []nums2={2,5,6};
        int n=3;
        merge(nums1, m, nums2, n); 
        System.out.print("[");
        for (int i=0; i<nums1.length; i++) {
            System.out.print(nums1[i]);
            if((i+1)<m+n) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}