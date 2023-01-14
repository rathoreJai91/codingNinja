package DataStructures.LinkedList;

public class IsPalindrome {
    
    public static boolean isPalindrome(Node<Integer> head){
        if(head==null || head.next==null){
            return true;
        }
        Node<Integer> temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        if(count%2==0){
            int i=0;
            int sum=0;
            while(temp!=null){
                if(i<count/2){
                    sum+=temp.data;
                }else{
                    sum-=temp.data;
                }
                i++;
                temp=temp.next;
            }
            if(sum==0){
                return true;
            }else{
                return false;
            }
        }else{
            int i=0;
            int sum=0;
            // int check=0;
            while(temp!=null){
                if(i<count/2){
                    sum+=temp.data;
                }else if(i==count/2){
                    // check=temp.data;
                }else{
                    sum-=temp.data;
                }
                i++;
            }
            if(sum==0){
                return true;
            }else{
                return false;
            }
        }

    }


    public static void main(String[] args) {
        Node<Integer> head= LinkedListUse.takeInput();
        System.out.println(isPalindrome(head));
    }
}
