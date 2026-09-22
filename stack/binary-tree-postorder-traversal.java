class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return ans;
        }

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();

            // ROOT
            ans.add(current.val);

            // Push LEFT first
            if (current.left != null) {
                stack.push(current.left);
            }

            // Push RIGHT second
            if (current.right != null) {
                stack.push(current.right);
            }
        }

        // Reverse ROOT → RIGHT → LEFT
        // to get LEFT → RIGHT → ROOT
        Collections.reverse(ans);

        return ans;
    }
}