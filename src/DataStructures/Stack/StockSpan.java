package DataStructures.Stack;

import java.util.Stack;

public class StockSpan {
    
    public static int[] stockSpan(int[] price){

        Stack<Integer> st = new Stack<>(); 
        int[] S=new int[price.length];  
        st.push(0);    
        S[0] = 1;     
        for(int i = 1; i < price.length; i++){     
            while((!st.empty()) && (price[st.peek()] <= price[i])){   
                st.pop();   
            }   
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());     
            st.push(i);   
        }
        return S;
    }

    public static void main(String[] args) {
        int arr[]={1,2,6,5,3,4};
        int[] result=stockSpan(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
