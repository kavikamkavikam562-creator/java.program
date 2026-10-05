class train41 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if (root == null)
            return ans;

        path(root, "", ans);
        return ans;
    }

    void path(TreeNode root, String s, List<String> ans) {
        s += root.val;

        if (root.left == null && root.right == null) {
            ans.add(s);
            return;
        }

        if (root.left != null)
            path(root.left, s + "->", ans);

        if (root.right != null)
            path(root.right, s + "->", ans);
    }
}
