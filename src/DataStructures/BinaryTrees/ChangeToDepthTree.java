package DataStructures.BinaryTrees;

public class ChangeToDepthTree {
    
    public static void replaceDepth(BinaryTreeNode<Integer> root, int depth){
        if(root == null){
            return;
        }
        root.data=depth;
        replaceDepth(root.left,depth+1);
        replaceDepth(root.right,depth+1);
    }
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
        if(root==null){
            return;
        }
        replaceDepth(root,0);
	}

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        BinaryTreeUse.printTreeDetailed(root);
        changeToDepthTree(root);
    }
}
