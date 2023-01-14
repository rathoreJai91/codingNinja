package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

    public static TreeNode<Integer> takeInputRec(boolean isroot){
        Scanner s =new Scanner(System.in);
        if(isroot){
            System.out.println("Enter root data:");
        }
        int rootData=s.nextInt();
        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
        System.out.println("Number Of children "+rootData+" have: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter child "+ i +" of "+rootData+": ");
            TreeNode<Integer> childNode = takeInputRec(false);
            root.children.add(childNode);
        }
        s.close();
        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData=s.nextInt();
        if(rootData==-1){
            s.close();
            return null;
        }
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front =pendingNodes.poll();
            System.out.print("Enter the number of children for "+front.data+": ");
            int numOfChild = s.nextInt();
            for(int i=1;i<=numOfChild;i++){
                System.out.print("Enter the "+i+" child data of"+ front.data+" : ");
                TreeNode<Integer> childNode= new TreeNode<Integer>(s.nextInt());
                front.children.add(childNode);
                pendingNodes.add(childNode);
                System.out.println();
            }
        }
        s.close();
        return root;
    }
    
    public static void printTree(TreeNode<Integer> root){

        //not the base case but just a case when the root was given null
        //at the beginning
        if(root==null){
            return;
        }
        //Root case is taken care by using the for loop
        //as if there are no children for loop will not execute
        System.out.print(root.data + ": ");
        for(int i=0;i<root.children.size();i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child = root.children.get(i);
            printTree(child);
        }
    }

    public static void printLevelWise(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front = pendingNodes.poll();
            if(front!=null){
                for(int i=0;i<front.children.size();i++){
                    pendingNodes.add(front.children.get(i));
                }
                System.out.print(front.data+" ");
            }else{
                if(!pendingNodes.isEmpty()){
                    pendingNodes.add(front);
                    System.out.println();
                }
            }
        }
    }

    public static void printPostOrder(TreeNode<Integer> root){

        if(root==null){
            return;
        }
        for(TreeNode<Integer> child : root.children){
            printPostOrder(child);
        }
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputRec(true);
        printTree(root);
    }

}
