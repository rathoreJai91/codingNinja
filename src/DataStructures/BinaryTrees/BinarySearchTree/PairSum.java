package DataStructures.BinaryTrees.BinarySearchTree;
import java.util.Stack;

import DataStructures.BinaryTrees.BinaryTreeNode;
public class PairSum {

    private static int numOfNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        return 1+numOfNodes(root.left)+numOfNodes(root.right);
    }

    public static void pairSum(BinaryTreeNode<Integer> root , int x){

        if(root==null){//check if the BST is null or not
            return;
        }
        Stack<BinaryTreeNode<Integer>> inStack= new Stack<>();//to store the inOrder stack
        Stack<BinaryTreeNode<Integer>> revStack= new Stack<>();//to store the Reverse inOrder stack
        BinaryTreeNode<Integer> currNode=root;//to iterate throughout the BST

        while(currNode!=null){
            inStack.add(currNode);
            currNode=currNode.left;
        }
        currNode=root;//reinitialising currNode to root for iterate for the right values

        while(currNode!=null){
            revStack.add(currNode);
            currNode=currNode.right;
        }

        int totalCount= numOfNodes(root);//will find the total number of nodes in the BST
        int count=0;

        while(count<totalCount-1){
            BinaryTreeNode<Integer> inTop=inStack.peek();
            BinaryTreeNode<Integer> revTop=revStack.peek();

            if((inTop.data+revTop.data)==x){
                System.out.println(inTop.data+" "+revTop.data);
                if(inTop.right!=null){
                    currNode=inTop.right;
                    inStack.pop();
                    while(currNode!=null){
                        inStack.add(currNode);
                        currNode=currNode.left;
                    }
                }else{
                    inStack.pop();
                }
                count++;
                if(revTop.left!=null){
                    currNode=revTop.left;
                    revStack.pop();
                    while(currNode!=null){
                        revStack.add(currNode);
                        currNode=currNode.right;
                    }
                }else{
                    revStack.pop();
                }
                count++;
            }else if((inTop.data+revTop.data)<x){
                if(inTop.right!=null){
                    currNode=inTop.right;
                    inStack.pop();
                    while(currNode!=null){
                        inStack.add(currNode);
                        currNode=currNode.left;
                    }
                }else{
                    inStack.pop();
                }
                count++;
            }else if((inTop.data+revTop.data)>x){
                if(revTop.left!=null){
                    currNode=revTop.left;
                    revStack.pop();
                    while(currNode!=null){
                        revStack.add(currNode);
                        currNode=currNode.right;
                    }
                }else{
                    revStack.pop();
                }
                count++;
            }
        }

    }

}
