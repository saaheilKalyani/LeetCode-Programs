class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        int maxFreq=0; 

        // count frequenct of each number
        for (int n :nums) {
            int count = freq.getOrDefault(n,0) +1; 
            freq.put(n, count); 
            maxFreq = Math.max(maxFreq, count); 
        }

        // count how many elements have frequency == maxFreq

        int result =0; 
        for (int count : freq.values()) {
            if (count == maxFreq) {
                result+=count; 
            }
        }

        return result; 
    }
}