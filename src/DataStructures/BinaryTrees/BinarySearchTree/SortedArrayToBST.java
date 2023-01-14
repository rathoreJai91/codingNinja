package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.BinaryTrees.BinaryTreeNode;

/*
 * Given a sorted integer array A of size n,
 * which contains all unique elements. You 
 * need to construct a balanced BST from this 
 * input array. Return the root of constructed BST.
 * Note: If array size is even, take first mid as root.
*/


public class SortedArrayToBST {

    public static BinaryTreeNode<Integer> createBST(int[] arr, int start, int end){
        
        if(start>end){
            return null;
        }
        if(start==end){
            return new BinaryTreeNode<Integer>(arr[start]);
        }
        int mid=(start+end)/2;
        BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(arr[mid]);

        root.left=createBST(arr, start, mid-1);
        root.right=createBST(arr, mid+1, end);

        return root;
    }

    public static BinaryTreeNode<Integer> sortedArrayToBST( int[] arr, int n){
        BinaryTreeNode<Integer> root=createBST(arr, 0, n-1);
        return root;
    }
}
