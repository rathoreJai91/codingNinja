package DataStructures.BinaryTrees;

public class NodesWithoutSiblings {
    
    public static void printNodesWithoutSiblings(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            if(root.right==null){
                System.out.println(root.left.data+" ");
            }
        }else{
            if(root.right!=null){
                System.out.println(root.right.data+" ");
            }
        }
        printNodesWithoutSiblings(root.left);
        printNodesWithoutSiblings(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        BinaryTreeUse.printTreeDetailed(root);
        printNodesWithoutSiblings(root);
    }
}
