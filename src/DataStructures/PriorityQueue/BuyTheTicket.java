package DataStructures.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class BuyTheTicket {
    
    public static int buyTicket(int input[], int k) {
        List<Integer> list= new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : input){
            list.add(i);
            pq.add(i);
        }
        int time=0;
        while(!pq.isEmpty()){
            if(list.get(0)==pq.peek()){
                if(k==0){
                    time++;
                    break;
                }
                list.remove(0);
                pq.remove();
                time++;
                k--;
            }else{
                list.add(list.get(0));
                list.remove(0);
                k--;
                if(k<0){
                    k=list.size()-1;
                }
            }
        }
        return time;
	}
}
