package DataStructures.Trees;

public class GetHeight {
    
    public static int getHeight(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int height=0;
        for(int i=0;i<root.children.size();i++){
            int childHeight=getHeight(root.children.get(i));
            height= Math.max(height,childHeight);
        }
        return height+1;
    }
}
