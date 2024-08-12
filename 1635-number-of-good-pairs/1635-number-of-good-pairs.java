class Solution {
   public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            if (freq.containsKey(num)) {
                // If num has been seen before, the number of good pairs is increased by the frequency count of that num
                count += freq.get(num);
                // Increment the frequency count of the current num
                freq.put(num, freq.get(num) + 1);
            } else {
                // If num is seen for the first time, set its frequency to 1
                freq.put(num, 1);
            }
        }
        
        return count;
    }}