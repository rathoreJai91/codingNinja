package DataStructures.BinaryTrees;

public class NumberOfLeafs {
    
    public static int numberOfLeafs(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return numberOfLeafs(root.left)+numberOfLeafs(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        BinaryTreeUse.printTreeDetailed(root);
        System.out.println(numberOfLeafs(root));
    }
}
