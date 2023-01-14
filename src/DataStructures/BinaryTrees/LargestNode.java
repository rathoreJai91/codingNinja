package DataStructures.BinaryTrees;

public class LargestNode {
    
    public static int largestNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        // int leftMax=largestNode(root.left);
        // int rightMax=largestNode(root.right);
        // int largest=Math.max(leftMax,rightMax);
        // largest=Math.max(largest,root.data);
        // return largest;

        
        return Math.max(root.data,Math.max(largestNode(root.left),largestNode(root.right)));
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        System.out.println(largestNode(root));
    }
}
