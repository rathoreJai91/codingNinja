package DataStructures.BinaryTrees;

/*
 * Given the binary Tree and two nodes say ‘x’ and ‘y’. 
 * Determine whether the two nodes are cousins of each 
 * other or not. Two nodes are said to be cousins of 
 * each other if they are at same level of the Binary 
 * Tree and have different parents.
 * Do it in O(n).
*/

public class CheckCousins {
    
    private static cousinReturn isCousinHelper(BinaryTreeNode<Integer> root , int elem){
        if(root==null){
            return new cousinReturn(-1, null);
        }
        if(root.data==elem){
            return new cousinReturn(0, null);
        }
        cousinReturn leftAns = isCousinHelper(root.left, elem);
        if(leftAns.depth!=-1){
            if(leftAns.parent!=null){
                leftAns.depth++;
                return leftAns;
            }else{
                leftAns.parent=root;
                leftAns.depth++;
                return leftAns;
            }
        }
        cousinReturn rightAns = isCousinHelper(root.right, elem);
        if(rightAns.depth!=-1){
            if(rightAns.parent!=null){
                rightAns.depth++;
                return rightAns;
            }else{
                rightAns.parent=root;
                rightAns.depth++;
                return rightAns;
            }
        }
        return rightAns;
    }

    public static boolean isCousin(BinaryTreeNode<Integer> root, int x , int y){
        cousinReturn forX = isCousinHelper(root,x);
        cousinReturn forY = isCousinHelper(root,y);
        if(forX.depth==forY.depth && forX.parent!=forY.parent){
            return true;
        }
        return false;
    }

}
class cousinReturn{
    int depth;
    BinaryTreeNode<Integer> parent;
    public cousinReturn(int depth, BinaryTreeNode<Integer> parent) {
        this.depth = depth;
        this.parent = parent;
    }
}