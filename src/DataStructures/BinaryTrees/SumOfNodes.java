package DataStructures.BinaryTrees;

public class SumOfNodes {
    
    public static int getSum(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftSum=getSum(root.left);
        int rightSum=getSum(root.right);

        int total=root.data+leftSum+rightSum;
        return total;

        //return root.data+getSum(root.left)+getSum(root.right);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        System.out.println(getSum(root));
    }
}
