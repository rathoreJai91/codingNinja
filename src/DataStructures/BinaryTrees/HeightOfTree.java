package DataStructures.BinaryTrees;

public class HeightOfTree {
    
    public static int heightOfTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        return 1+Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        System.out.println(heightOfTree(root));
    }
}
