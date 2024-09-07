class Solution {
   public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            if (freq.containsKey(num)) {
                
                count += freq.get(num);
              
                freq.put(num, freq.get(num) + 1);
            } else {
                
                freq.put(num, 1);
            }
        }
        
        return count;
    }}