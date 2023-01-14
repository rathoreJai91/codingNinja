package DataStructures.BinaryTrees;

/*
 * For a given a Binary Tree of type integer, 
 * find and return the minimum and the maximum data values.
 * Return the output as an object of Pair class, which is already created.
*/
public class GetMinAndMax {
    
    public static Pair<Integer,Integer> getMinAndMax(BinaryTreeNode<Integer> root){

        if(root == null){
            Pair<Integer,Integer> ans = new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
            return ans;
        }
        Pair<Integer, Integer> left=getMinAndMax(root.left);
        Pair<Integer, Integer> right=getMinAndMax(root.right);

        int min=Math.min(left.minimum, right.minimum);
        min=Math.min(root.data,min);
        // int min = Math.min(root.data, Math.min(left.minimum , right.minimum));

        int max= Math.max(left.maximum, right.maximum);
        max=Math.max(root.data,max);
        // int max = Math.max(root.data, Math.max(left.maximum , right.maximum));

        return new Pair<>(min, max);

    }

}
