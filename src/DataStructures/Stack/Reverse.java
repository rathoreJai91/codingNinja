package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra){

        if(input.size()==1){
            return;
        }

        int top=input.pop();
        reverseStack(input, extra);
        while(!input.empty()){
            extra.push(input.pop());
        }
        input.push(top);
        while(!extra.empty()){
            input.push(extra.pop());
        }

    }
    
    public static void main(String[] args) {
        Stack<Integer> input=new Stack<>();
        Stack<Integer> extra=new Stack<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            input.push(s.nextInt());
        }
        reverseStack(input,extra);
        for(int i=0;i<n;i++){
            System.out.print(input.pop()+" ");
        }
        s.close();
    }
}
