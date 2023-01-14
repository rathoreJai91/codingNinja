package Recursion;

public class SortedArrayCheck {

    public static boolean isSorted(int a[]) {
        if(a.length==1){
            return true;
        }
        if(a[0]>a[1]){
            return false;
        }
        int smallArr[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArr[i-1]=a[i];
        }
        boolean check=isSorted(smallArr);
        return check;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,6,5};
        System.out.println(isSorted(a));
    }
}
