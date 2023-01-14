package DataStructures.Trees;

/*
 * Given a tree, find and return the node for 
 * which sum of data of all children and the 
 * node itself is maximum. In the sum, data of 
 * node itself and data of immediate children 
 * is to be taken.
*/

public class MaxSumNode {
    
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root==null){
            return null;
        }
        TreeNode<Integer> maxNode=root;
        int maxSum=root.data;
        for(TreeNode<Integer> child : root.children){
            maxSum+=child.data;
        }
        for(TreeNode<Integer> child : root.children){
            TreeNode<Integer> currChild=maxSumNode(child);
            int currSum=currChild.data;
            for(int i=0;i<currChild.children.size();i++){
                currSum+=currChild.children.get(i).data;
            }
            if(currSum>maxSum){
                maxSum=currSum;
                maxNode=currChild;
            }
        }
        return maxNode;
    }
}
