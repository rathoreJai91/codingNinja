package fundamentals;

public class DataTypeStorage {
    
    public static void main(String[] args) {
        // int min=Integer.MIN_VALUE;
        // int max=Integer.MAX_VALUE;

        // System.out.println(min+" "+max);
        
        // String str="abcd";
        // System.out.println(str+3);

        // char ch='a';
        // int i=ch;       //THIS IS ALLOWED BECAUSE WE ARE CONVERTING A SMALLER VALUE TO A LARGER ONE

        // ch=(char)i;     //TO CONVERT A DATATYPE FROM HIGHER BIT VALUE TO A LOWER ONE
        //                 //IT IS NOT ALLOWED NORMALLY BUT CAN BE DONE BY FORCE BY SPECIFYING
        //                 //THE DATATYPE
        // System.out.println(ch);

        // int i=(int)10.7;
        // System.out.println(i);

        int i=34000;
        short s=(short)i;

        System.out.println(s);
        float f=1.4f;
        System.out.println(f);

    }

    
}
