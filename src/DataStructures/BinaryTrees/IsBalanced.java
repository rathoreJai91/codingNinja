package DataStructures.BinaryTrees;

/*Check if the Binary tree is balanced
  For a BT to be balanced it need to fulfill the following condition
  -> leftHeight-rightHeight<=1;
*/

public class IsBalanced {

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            BalancedTreeReturn ans = new BalancedTreeReturn(0, true);
            return ans;
        }

        BalancedTreeReturn leftOutput=isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput=isBalancedBetter(root.right);
        
        Boolean isBal=true;
        int height=1+Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height - rightOutput.height)>1){
            isBal=false;
        }
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal=false;
        }

        BalancedTreeReturn ans =new BalancedTreeReturn(height, isBal);
        return ans;

    }

    
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int leftHeight=HeightOfTree.heightOfTree(root.left);
        int rightHeight=HeightOfTree.heightOfTree(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        boolean isLeftBalanced=isBalanced(root.left);
        boolean isRightBalanced=isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

}
