class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean isDuplicate = false;
        for(int i = 0; i<nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }
}