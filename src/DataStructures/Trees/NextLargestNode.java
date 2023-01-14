package DataStructures.Trees;

/*
 * Given a generic tree and an integer n. 
 * Find and return the node with next larger 
 * element in the Tree i.e. find a node with 
 * value just greater than n.
*/
public class NextLargestNode {
    
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root , int n){
        if(root == null){
            return null;
        }
        TreeNode<Integer> nextLargest = null;
        if(root.data>n){
            nextLargest=root;
        }
        for(TreeNode<Integer> child : root.children){
            TreeNode<Integer> currChild=findNextLargerNode(child, n);
            if(currChild!=null && currChild.data>n){
                if(nextLargest==null){
                    nextLargest=currChild;
                }else if(currChild.data<nextLargest.data){
                    nextLargest=currChild;
                }
            }
        }
        return nextLargest;
    }

}
