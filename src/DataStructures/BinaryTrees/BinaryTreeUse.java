package DataStructures.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter Root Data: ");
        Scanner s = new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1){
            s.close();
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInput();
        BinaryTreeNode<Integer> rightChild= takeTreeInput();
        root.left=leftChild;
        root.right=rightChild;
        s.close();
        return root;
    } 

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isroot, int parentData, boolean isLeft){
        if(isroot){
            System.out.print("Enter root Data:");
        }else{
            if(isLeft){
                System.out.println("Enter left child of "+ parentData+":");
            }else{
                System.out.println("Enter right child of "+ parentData+":");
            }
        }
        Scanner s= new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1){
            s.close();
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left=leftChild;
        root.right=rightChild;
        s.close();
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Root Data: ");
        int rootdata=s.nextInt();

        if(rootdata == -1){
            s.close();
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChild.add(root);

        while(!pendingChild.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChild.poll();
            
            System.out.println("Enter left child of " + front.data + ":");
            int left = s.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left=leftChild;
                pendingChild.add(leftChild);
            }

            System.out.println("Enter right child of " + front.data + ":");
            int right = s.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                front.right=rightChild;
                pendingChild.add(rightChild);
            }
        }
        s.close();
        return root;

    }

    public static void printTree(BinaryTreeNode<Integer> root){
        //Base case
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        printTree(root.left);
        printTree(root.right);
    }

    //Improved version
    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null){
            System.out.print("L"+root.left.data);
            if(root.right!=null){
                System.out.print(", R"+root.right.data);
            }
        }else if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }


    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<>();
        pendingChild.add(root);

        while(!pendingChild.isEmpty()){
            BinaryTreeNode<Integer> front =pendingChild.poll();
            System.out.print(front.data+":L:");
            
            if(front.left!=null){
                System.out.print(front.left.data + ",R:");
                pendingChild.add(front.left);
            }else{
                System.out.print(-1 + ",R:");
            }
            if(front.right!=null){
                System.out.println(front.right.data);
                pendingChild.add(front.right);
            }else{
                System.out.println(-1);
            }
        }
    }

    /*
     * For a given a Binary Tree of type integer, 
     * print it in a level order fashion where each 
     * level will be printed on a new line. Elements 
     * on every level will be printed in a linear 
     * fashion and a single space will separate them.
    */
    
    public static void printLevelWise2(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<>();
        pendingChild.add(root);
        pendingChild.add(null);

        while(!pendingChild.isEmpty()){
            BinaryTreeNode<Integer> front =pendingChild.poll();
            if(front!=null){
                System.out.print(front.data+" ");
                if(front.left!=null){
                    pendingChild.add(front.left);
                }
                if(front.right!=null){
                    pendingChild.add(front.right);
                }
            }
            else{
                if(!pendingChild.isEmpty()){
                    System.out.println();
                    pendingChild.add(front);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        // root.left=rootLeft;
        // root.right=rootRight;

        // BinaryTreeNode<Integer> twosRight = new BinaryTreeNode<>(4);
        // BinaryTreeNode<Integer> threesLeft = new BinaryTreeNode<>(5);
        // rootLeft.right=twosRight;
        // rootRight.left=threesLeft;

        // printTree(root);
        // System.out.println();
        // printTreeDetailed(root);
        
        //Using take Input function
        //BinaryTreeNode<Integer> root =takeTreeInput();
        //BinaryTreeNode<Integer> root =takeTreeInputBetter(true, 0, false);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        //printTreeDetailed(root);
        printLevelWise(root);
    }
}
