package DataStructures.Trees;

public class NodesGreaterThan {
    public static int numNodeGreater(TreeNode<Integer> root ,int x){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.data>x){
            count++;
        }
        for(int i=0;i<root.children.size();i++){
            int childCount=numNodeGreater(root.children.get(i), x);
            count+=childCount;
        }
        return count;
    }
}
