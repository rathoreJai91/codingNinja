package DataStructures.Trees;

/*
 * Remove all leaf nodes from a given generic Tree. 
 * Leaf nodes are those nodes, which don't have any children.
 * Note : Root will also be a leaf node if it doesn't have any 
 * child. You don't need to print the tree, just remove all leaf 
 * nodes and return the updated root.
*/
public class RemoveLeafNode {
    
    public static TreeNode<Integer> removeLeafs(TreeNode<Integer> root){
        if(root==null || root.children.size()==0){
            return null;
        }
        for(int i=0;i<root.children.size();i++){
            if(root.children.get(i).children.size()==0){
                root.children.remove(i);
                i--;
            }else{
                removeLeafs(root.children.get(i));
            }
        }
        return root;
    }

}
