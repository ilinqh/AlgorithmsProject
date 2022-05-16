package interview_question;

public class _0406SuccessorLcci {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            TreeNode successor = null;
            if (p.right != null) {
                successor = p.right;
                while (successor.left != null) {
                    successor = successor.left;
                }
                return successor;
            }
            TreeNode node = root;
            while (node != null) {
                if (node.val > p.val) {
                    successor = node;
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
            return successor;
        }
    }
}
