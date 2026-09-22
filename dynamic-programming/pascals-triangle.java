class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        int layer = 1;

        while (layer <= numRows) {

            List<Integer> nums = new ArrayList<>();

            int low = 0;
            int high = layer - 1;

            // first number
            nums.add(1);

            // middle numbers
            if (layer > 2) {

                List<Integer> previous = result.get(layer - 2);

                for (int i = low; i < high - 1; i++) {

                    nums.add(previous.get(i) + previous.get(i + 1));
                }
            }

            // last number
            if (layer > 1) {
                nums.add(1);
            }

            result.add(nums);

            layer++;
        }

        return result;
    }
}