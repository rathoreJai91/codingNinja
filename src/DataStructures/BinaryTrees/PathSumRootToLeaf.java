package DataStructures.BinaryTrees;

/*
 * For a given Binary Tree of type integer 
 * and a number K, print out all root-to-leaf 
 * paths where the sum of all the node data 
 * along the path is equal to K.
*/

public class PathSumRootToLeaf {
    
    public static void rootToLeafHelper(BinaryTreeNode<Integer> root, int k, String sum){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            if(root.data==k){
                sum+=root.data+" ";
                System.out.println(sum);
            }
            return;
        }
        sum+=root.data+" ";
        rootToLeafHelper(root.left, k-root.data, sum);
        rootToLeafHelper(root.right, k-root.data, sum);
    }

}
