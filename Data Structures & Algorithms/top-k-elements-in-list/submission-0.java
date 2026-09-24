class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Count frequency of each element in the array
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> list = new ArrayList<>(frequencyMap.keySet());
        list.sort((a,b) -> frequencyMap.get(b)- frequencyMap.get(a));

        int[] result = new int[k];
        for(int i = 0; i<k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
