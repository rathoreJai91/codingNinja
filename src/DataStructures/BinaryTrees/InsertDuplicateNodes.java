package DataStructures.BinaryTrees;

/*
For a given a Binary Tree of type integer, 
duplicate every node of the tree and attach 
it to the left of itself.
The root will remain the same. 
So you just need to insert nodes in the given Binary Tree.
*/
public class InsertDuplicateNodes {
    
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root){
        
        //bottom up approach
        if(root==null){
            return;
        }
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);

        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);

        if(root.left!=null){
            newNode.left=root.left;
            root.left=newNode;
        }else{
            root.left=newNode;
        }

        //top to down approach
        
        // BinaryTreeNode<Integer> newNode2 = new BinaryTreeNode<Integer>(root.data);
        // BinaryTreeNode<Integer> rootLeft=root.left;
        // root.left=newNode2;
        // newNode2.left=rootLeft;

        // insertDuplicateNode(rootLeft);
        // insertDuplicateNode(root.right);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
        BinaryTreeUse.printLevelWise(root);
        insertDuplicateNode(root);
        BinaryTreeUse.printLevelWise(root);
    }
}
