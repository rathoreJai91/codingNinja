package DataStructures.BinaryTrees;

import java.util.Scanner;


public class BuildTree {
    

    //Using PreOrder and InOrder
    public static BinaryTreeNode<Integer> buildTreeHelperPreIn(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn){

        if(siPre>eiPre){
            return null;
        }

        int rootData=pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }
        int siPreLeft=siPre+1;
        int siInLeft=siIn; 
        int eiInLeft=rootIndex-1;
        int siInRight=rootIndex+1;
        int eiPreRight=eiPre;
        int eiInRight=eiIn;

        int leftLength=eiInLeft-siInLeft+1;

        int eiPreLeft=siPreLeft+leftLength-1;
        int siPreRight=eiPreLeft+1;
        
        BinaryTreeNode<Integer> left = buildTreeHelperPreIn(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeHelperPreIn(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

        root.left=left;
        root.right=right;
        return root;
    }

//using InOrder and PostOrder

    public static BinaryTreeNode<Integer> buildTreeHelperInPost(int[] post, int[] in, int siPost, int eiPost, int siIn, int eiIn){
        
        if(siPost>eiPost){
            return null;
        }
        int rootData=post[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }
        int siPostLeft=siPost;
        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;;
        int eiPostRight=eiPost-1;
        int siInRight=rootIndex+1;
        int eiInRight=eiIn;

        int leftLength=eiInLeft-siInLeft+1;

        int eiPostLeft=siPostLeft+leftLength-1;
        int siPostRight=eiPostLeft+1;

        BinaryTreeNode<Integer> left=buildTreeHelperInPost(post, in, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right=buildTreeHelperInPost(post, in, siPostRight, eiPostRight, siInRight, eiInRight);

        root.left=left;
        root.right=right;
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree2(int[] postOrder, int[] inOrder){
        BinaryTreeNode<Integer> root = buildTreeHelperInPost(postOrder, inOrder, 0, postOrder.length-1, 0, inOrder.length-1);
        return root;
    }

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        BinaryTreeNode<Integer> root =buildTreeHelperPreIn(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
        return root;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        int preOrder[] = new int[n];
        int inOrder[] = new int[n];

        for(int i=0;i<n;i++){
            preOrder[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            inOrder[i]=s.nextInt();
        }

        BinaryTreeNode<Integer> root= buildTree(preOrder, inOrder);
        BinaryTreeUse.printLevelWise(root);
        s.close();
    }
}
