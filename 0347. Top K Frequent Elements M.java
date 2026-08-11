class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []arr = new int[k]; 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1); 
        }
        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(map.entrySet()); 
        lst.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed()); 
        int i = 0; 
        for (Map.Entry<Integer,Integer> e : lst) {
            if (i < k) {
                arr[i] = e.getKey(); 
            }    
            i++; 
        }
        return arr; 
    }
    
}