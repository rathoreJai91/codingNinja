package DataStructures.Trees;

public class ReplaceWithDepth {
    
    private static void replaceDepthHelper(TreeNode<Integer> root , int depth){
        root.data=depth;
        for(TreeNode<Integer> child : root.children){
            replaceDepthHelper(child, depth+1);
        }
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root){
        replaceDepthHelper(root,0);
    }

}
