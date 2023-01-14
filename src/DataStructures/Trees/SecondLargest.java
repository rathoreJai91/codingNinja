package DataStructures.Trees;

public class SecondLargest {
    
    private static SecondLargestReturn<Integer> findSecondLargestHelper(TreeNode<Integer> root){
        SecondLargestReturn<Integer> ans = new SecondLargestReturn<>(root, null);
        for(TreeNode<Integer> child : root.children){
            SecondLargestReturn<Integer> childAns= findSecondLargestHelper(child);
            if(childAns.firstMax.data>ans.firstMax.data){
                ans.secondMax=ans.firstMax;
                ans.firstMax=childAns.firstMax;
                if(childAns.secondMax!=null && childAns.secondMax.data>ans.secondMax.data){
                    ans.secondMax=childAns.secondMax;
                }
            }else if(ans.secondMax==null ){
				if(childAns.firstMax.data!=ans.firstMax.data){
					ans.secondMax=childAns.firstMax;
				}else{
					ans.secondMax=childAns.secondMax;
				}
            }else if(ans.secondMax!=null && childAns.firstMax.data>ans.secondMax.data && childAns.firstMax.data!=ans.firstMax.data){
                ans.secondMax=childAns.firstMax;
            }
        }
        return ans;
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        TreeNode<Integer> result = findSecondLargestHelper(root).secondMax;
        return result;
    }

}
class SecondLargestReturn<T>{
    TreeNode<T> firstMax;
    TreeNode<T> secondMax;
    public SecondLargestReturn(TreeNode<T> firstMax, TreeNode<T> secondMax) {
        this.firstMax = firstMax;
        this.secondMax = secondMax;
    }
}
