class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
        .boxed().collect(Collectors.toSet());

        Integer maxLength = 0;
        
        for(int i : set) {
            int parent = i-1;
            if(!set.contains(parent)) {
                int count = 0;
                int next = parent+1;
                while(set.contains(next)) {
                    count++;
                    next++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}
