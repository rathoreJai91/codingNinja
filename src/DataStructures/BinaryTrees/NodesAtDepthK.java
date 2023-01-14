package DataStructures.BinaryTrees;

public class NodesAtDepthK {
    
    public static void nodesAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.println(root.data+" ");
            return;
        }
        nodesAtDepthK(root.left, k-1);
        nodesAtDepthK(root.right, k-1);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root =BinaryTreeUse.takeTreeInputBetter(true, 0, false);
        BinaryTreeUse.printTreeDetailed(root);
        nodesAtDepthK(root, 2);
    }
}
