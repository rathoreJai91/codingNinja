package DataStructures.BinaryTrees;

//for a given Binary Tree of type integer, 
//update it with its corresponding mirror image.

public class MirrorBinaryTree {
    
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        
    }

}
