package Recursion;

public class LastIndex {

    private static int lastIndex(int arr[], int x) {

        if(arr.length==0){
            return -1;
        }
        int smallArr[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArr[i-1]=arr[i];
        }
        int fi=lastIndex(smallArr, x);
        if(fi!=-1){
            return fi+1;
        }
        if(arr[0]==x){
            return 0;
        }
        return -1;
    }

    private static int lastIndex(int arr[],int x, int si ) {
        
        if(si==arr.length){
            return -1;
        }
        int fi=lastIndex(arr, x, si+1);
        if(fi!=-1){
            return fi;
        }
        if(arr[si]==x){
            return si;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,2};
        int x=6;
        int si=0;
        System.out.println(lastIndex(arr,x));
        System.out.println(lastIndex(arr,x,si));

    }
}
