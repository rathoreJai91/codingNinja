package DataStructures.Trees;

public class SumOfAllNodes {
    
    public static int sumOfAllNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int totalSum=root.data;
        for(int i=0;i<root.children.size();i++){
            int childSum=sumOfAllNodes(root.children.get(i));
            totalSum += childSum;
        }
        return totalSum;
    }

}
