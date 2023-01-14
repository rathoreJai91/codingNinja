package DataStructures.BinaryTrees;


// For a given a binary tree of integers and an integer X, 
// find and return the total number of nodes of the given 
// binary tree which are having data greater than X.


public class NodesGreaterThanX {

    public static int nodesGreaterThanX(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return 0;
        }
        int leftcount=nodesGreaterThanX(root.left, x);
        int rightcount=nodesGreaterThanX(root.right, x);

        return (root.data==x)?1+leftcount+rightcount : leftcount+rightcount;
    }

    public static void main(String[] args) {
        
    }
}
