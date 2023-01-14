package Recursion;

public class CheckNumber {

    public static Boolean checkNumber(int arr[],int x) {
        if(arr.length==1){
            if(arr[0]==x)
                return true;
            else{return false;}
        }
        if(arr[0]==x){
            return true;
        }
        int smallArr[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArr[i-1]=arr[i];
        }
        boolean check=checkNumber(smallArr,x);
        return check;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=9;
        System.out.println(checkNumber(arr,x));
    }
}
