package DataStructures.Trees;

/*
 * Given two Generic trees, return true if they are structurally identical 
 * i.e. they are made of nodes with the same values arranged in the same way.
*/
public class CheckIdentical {
    
    public static boolean checkIdentical(TreeNode<Integer> root1 , TreeNode<Integer> root2){
        if(root1==null || root2==null){
            return false;
        }
        if(root1.data!=root2.data || root1.children.size()!=root2.children.size()){
            return false;
        }
        boolean check=true;
        for(int i=0;i<root1.children.size();i++){
            if(!checkIdentical(root1.children.get(i), root2.children.get(i))){
                check=false;
                break;
            }
        }
        return check;
    }

}
