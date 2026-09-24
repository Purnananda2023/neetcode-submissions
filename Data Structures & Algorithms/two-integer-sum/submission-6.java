class Solution {
    public int[] twoSum(int[] nums, int sum) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i< nums.length;i++) {
            int firstOfPair = sum - nums[i];
            int secondIndex = i;
            if(map.containsKey(firstOfPair)){
                int firstIndex = map.get(firstOfPair);
                result[0] = firstIndex;
                result[1] = secondIndex;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
