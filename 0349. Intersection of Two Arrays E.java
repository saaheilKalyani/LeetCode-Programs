import java.util.*; 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> common = new HashSet<>(); 
        
        int no=0; 
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    common.add(nums1[i]);
                }
            }
        }
        int []number = new int [common.size()];
        for (int n : common) {
            number[no] = n;
            no++; 
        }
        return number;
    }
}