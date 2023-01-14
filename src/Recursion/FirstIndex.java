package Recursion;

public class FirstIndex {

    private static int firstIndex(int[] arr, int x,int si) {
        
        // if(arr.length==1){
        //     if(arr[0]==x){
        //         return 0;
        //     }else{return -1;}
        // }
        // if(arr[0]==x){
        //     return 0;
        // }
        // int[] smallArr=new int[arr.length-1];
        // for(int i=1;i<arr.length;i++){
        //     smallArr[i-1]=arr[i];
        // }
        // int temp=firstIndex(smallArr, x);
        // if(temp==-1){
        //     return temp;
        // }
        // int index=1+temp;
        // return index;

        if(si==arr.length-1){
            if(arr[si]!=x){
                return -1;
            }
        }
        if(arr[si]==x){
            return si;
        }
        int index=firstIndex(arr, x, si+1);
        return index;
    }

     public static void main(String[] args) {
        int arr[]={1,2,3,2,5};
        int x=6;
        int si=0;
        System.out.println(firstIndex(arr,x,si));
     }
}
