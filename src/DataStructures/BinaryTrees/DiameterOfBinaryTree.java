package DataStructures.BinaryTrees;

public class DiameterOfBinaryTree {
    
    public static DiameterReturn diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            DiameterReturn ans=new DiameterReturn(0, 0);
            return ans;
        }

        DiameterReturn leftSide= diameterOfBinaryTree(root.left);
        DiameterReturn rightSide= diameterOfBinaryTree(root.right);

        int height=1+ Math.max(leftSide.height, rightSide.height);
        int diameter=1+leftSide.height+rightSide.height;

        int maxDia=Math.max(leftSide.diameter,rightSide.diameter);
        maxDia=Math.max(diameter, maxDia);

        DiameterReturn ans=new DiameterReturn(height, maxDia);
        return ans;

    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        BinaryTreeUse.printTreeDetailed(root);

        System.out.println("diameter of the Binary Tree is " + diameterOfBinaryTree(root).diameter);

    }

}

