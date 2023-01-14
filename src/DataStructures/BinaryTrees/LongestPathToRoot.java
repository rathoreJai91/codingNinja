package DataStructures.BinaryTrees;
import java.util.ArrayList;

/*
 * Given a binary tree, return the longest path from 
 * leaf to root. Longest means, a path which contain 
 * maximum number of nodes from leaf to root. 
*/

public class LongestPathToRoot {
    
    public static ArrayList<Integer> longestPath(BinaryTreeNode<Integer> root){
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer> leftPath = longestPath(root.left);
        ArrayList<Integer> rightPath = longestPath(root.right);
        if(leftPath.size()>rightPath.size()){
            leftPath.add(root.data);
            return leftPath;
        }
        rightPath.add(root.data);
        return rightPath;
    }

}
