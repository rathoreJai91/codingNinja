package DataStructures.Trees;

public class LeafNodes {
    
    public static int countLeafNodes(TreeNode<Integer> root){
        int count=0;
        for(TreeNode<Integer> child : root.children){
            count+=countLeafNodes(child);
        }
        if(count==0){
            return 1;
        }
        return count;
    }

}
