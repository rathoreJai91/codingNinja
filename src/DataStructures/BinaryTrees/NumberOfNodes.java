package DataStructures.BinaryTrees;

public class NumberOfNodes {
    
    public static int numberOfNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftNodeCount=numberOfNodes(root.left);
        int rightNodeCount=numberOfNodes(root.right);
        return 1+leftNodeCount+rightNodeCount;

        //return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
    }

    public static void main(String[] args) {
        
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        System.out.println(numberOfNodes(root));
    }
}
