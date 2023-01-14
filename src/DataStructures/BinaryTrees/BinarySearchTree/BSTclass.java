package DataStructures.BinaryTrees.BinarySearchTree;
import DataStructures.BinaryTrees.BinaryTreeNode;


public class BSTclass {
    
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node ,int x){
        if(node==null){
            return false;
        }
        if(node.data==x){
            return true;
        }
        if(node.data>x){
            return isPresentHelper(node.left, x);
        }
        else{
            return isPresentHelper(node.right, x);
        }
    }
    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }

    
    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node ,  int x){
        if(node==null){
            BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<Integer>(x);
            return newRoot;
        }
        if(node.data>=x){
            node.left=insert(node.left, x);
        }else{
            node.right=insert(node.right, x);
        }
        return node;
    }
    public void insert(int x){
        root=insert(root,x);
        size++;
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, minimum(root.right));
    }
    private static deleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x){
        if(root==null){
            return new deleteReturn(null,false);
        }
        if(root.data>x){
            deleteReturn output = deleteHelper(root.left,x);
            root.left=output.node;
            output.node=root;
            return output;
        }
        if(root.data<x){
            deleteReturn output = deleteHelper(root.right,x);
            root.right=output.node;
            output.node=root;
            return output;
        }
        // if x is equal to root.data
        // If root has 0 child
        if(root.left==null && root.right==null){
            return new deleteReturn(null,true);
        }
        //If root has only left child
        if(root.left!=null && root.right==null){
            return new deleteReturn(root.left,true);
        }
        //If root has only right child
        if(root.left == null &&root.right!=null){
            return new deleteReturn(root.right,true);
        }

        //If root has 2  or both child
        root.data=minimum(root.right);
        deleteReturn output = deleteHelper(root.right,root.data);
        root.right=output.node;
        return new deleteReturn(root, true);

    }
    public boolean delete(int x){
        deleteReturn output=deleteHelper(root,x);
        root=output.node;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }


    public int size(){
        return size;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node==null){
            return;
        }
        System.out.print(node.data+": ");
        if(node.left!=null){
            System.out.print("L:"+node.left.data+", ");
            if(node.right!=null){
                System.out.print("R:"+node.right.data);
            }
        }else if(node.right!=null){
            System.out.print("R:"+node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
    public void printTree(){
        printTreeHelper(root);
    }
}
class deleteReturn{
    BinaryTreeNode<Integer> node;
    boolean deleted;

    public deleteReturn(BinaryTreeNode<Integer> node, boolean deleted) {
        this.node = node;
        this.deleted = deleted;
    }
}
