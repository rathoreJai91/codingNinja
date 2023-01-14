package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.BinaryTrees.BinaryTreeNode;

/*
 * Given a binary search tree and data of two nodes, 
 * find 'LCA' (Lowest Common Ancestor) of the given 
 * two nodes in the BST.
 * Note:
 * 1. If out of 2 nodes only one node is present, return that node. 
 * 2. If both are not present, return -1.
 * 3. all the node data will be unique.
*/

public class GetLCA {
    
    //helper function will take root node and both the integers
    //and find the Lowest Common Ancestor of a and b
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root , int a, int b){
        if(root==null){
            return null;
        }
        if(root.data>a && root.data>b){
            return helper(root.left, a, b);
        }
        if(root.data<a && root.data<b){
            return helper(root.right, a, b);
        }
        return root;
    }

    //isPresent function will check if the values a and b are there
    //in the tree
    public static boolean isPresent(BinaryTreeNode<Integer> root, int a){
        if(root==null){
            return false;
        }
        if(root.data>a){
            return isPresent(root.left, a);
        }
        if(root.data<a){
            return isPresent(root.right, a);
        }
        return true;
    }

    public static int getLCA(BinaryTreeNode<Integer> root , int a, int b){
        BinaryTreeNode<Integer> targetNode = helper(root, a, b);
        if(targetNode!=null){
            boolean isA=isPresent(targetNode,a);
            boolean isB=isPresent(targetNode,b);
            if(isA && isB){
                return targetNode.data;
            }
            if(isA && !isB){
                return a;
            }
            if(!isA && isB){
                return b;
            }
        }
        return -1;
    }

}
