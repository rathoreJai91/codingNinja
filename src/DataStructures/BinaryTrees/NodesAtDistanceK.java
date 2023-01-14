package DataStructures.BinaryTrees;

public class NodesAtDistanceK {
    
    public static void printNodes(BinaryTreeNode<Integer> root, int k){
        if(root==null || k==-1){
            return ;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        printNodes(root.left, k-1);
        printNodes(root.right, k-1);
    }

    public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int node, int k){

        if(root == null){
            return -1;
        }

        if(root.data==node){
            printNodes(root,k);
            return 0;
        }

        int leftDist=nodesAtDistanceKHelper(root.left, node, k);
        if(leftDist!=-1){
            if(leftDist+1==k){
                System.out.println(root.data);
                return -1;
            }else{
                printNodes(root.right, k-leftDist-2);
            }
            return leftDist+1;
        }

        int rightDist=nodesAtDistanceKHelper(root.right, node, k);
        if(rightDist!=-1){
            if(rightDist+1==k){
                System.out.println(root.data);
                return -1;
            }else{
                printNodes(root.left, k-rightDist-2);
            }
            return rightDist+1;
        }
        return -1;
    }

}
