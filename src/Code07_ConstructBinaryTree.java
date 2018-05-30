/**
 * @author Coder-Leon
 * @date 2018/5/30 21:21
 */
public class Code07_ConstructBinaryTree {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

        if (startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++)
            if (in[i] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }

        return root;
    }

    public static void main(String[] args) {
        Code07_ConstructBinaryTree code07 = new Code07_ConstructBinaryTree();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        TreeNode result =  code07.reConstructBinaryTree(pre, 0, 7, in, 0, 7);

        System.out.println(result.val);
    }
}
