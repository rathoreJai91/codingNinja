package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.BinaryTrees.BinaryTreeNode;
public class LargestBST {
    
    private static LargestBSTReturn largestBSTHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return new LargestBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }
        LargestBSTReturn leftAns = largestBSTHelper(root.left);
        LargestBSTReturn rightAns = largestBSTHelper(root.right);
        int height=Math.max(leftAns.height,rightAns.height);
        int mini=Math.min(leftAns.mini,root.data);
        int maxi=Math.max(rightAns.maxi,root.data);
        if(leftAns.maxi<root.data && root.data<rightAns.mini){
            if(leftAns.isBST==true && rightAns.isBST==true){
                return new LargestBSTReturn(mini, maxi, height+1 , true);
            }else{
                return new LargestBSTReturn(mini, maxi, height, false);
            }
        }else{
            return new LargestBSTReturn(mini, maxi, height, false);
        }
    }


    public static int largestBSTSubTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int height=largestBSTHelper(root).height;
        return height;
    } 

}

class LargestBSTReturn{
    int mini;
    int maxi;
    int height;
    boolean isBST;
    public LargestBSTReturn(int mini, int maxi, int height, boolean isBST) {
        this.mini = mini;
        this.maxi = maxi;
        this.height = height;
        this.isBST = isBST;
    }
}
