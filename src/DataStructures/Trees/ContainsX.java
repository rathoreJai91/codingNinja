package DataStructures.Trees;

/*
 * Given a generic tree and an integer x, 
 * check if x is present in the given tree 
 * or not. Return true if x is present, 
 * return false otherwise.

 */

public class ContainsX {
    
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        boolean check=false;
        for(TreeNode<Integer> child : root.children){
            check=checkIfContainsX(child, x);
            if(check){
                break;
            }
        }
        return check;
    }

}
