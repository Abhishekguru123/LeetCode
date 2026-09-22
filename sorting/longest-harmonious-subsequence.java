class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int max = 0;

        // Check every number with number + 1
        for (int num : map.keySet()) {

            if (map.containsKey(num + 1)) {

                int length = map.get(num) + map.get(num + 1);

                max = Math.max(max, length);
            }
        }

        return max;
    }
}