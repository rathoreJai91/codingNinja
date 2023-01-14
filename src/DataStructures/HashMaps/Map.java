package DataStructures.HashMaps;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<MapNode<K,V>> buckets;
    int count;
    int numBuckets;

    public Map(){
        buckets = new ArrayList<>();
        numBuckets=20;
        for(int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
    }
    //get the hashcode for every key
    private int getBucketIndex(K key){
        int hc=key.hashCode();
        int index=hc%numBuckets;
        return index;
    }

    public double loadFactor(){
        return (1.0*count)/numBuckets;
    }

    public int size(){
        return count;
    }

    public V removeKey(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev=null; //keeps track of previous node of head
        while(head!=null){
            if(head.key.equals(key)){//we find the key
                if(prev==null){//if it is at the head make head.next the new head
                    buckets.set(bucketIndex, head.next);
                }else{
                    prev.next=head.next;//connect head.next with prev
                }
                count--;
                return head.value;
            }
            prev=head;
            head=head.next;
        }
        return null;
    }

    public V getValue(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        //search for the Key
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        //if Key is not present return null
        return null;
    }

    private void reHash(){
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        for(int i=0;i<2*numBuckets;i++){
            buckets.add(null);
        }
        count=0;
        numBuckets=numBuckets*2;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V> head = temp.get(i);
            while(head!=null){
                K key=head.key;
                V value=head.value;
                insert(key, value);
                head=head.next;
            }
        }
    }

    public void insert(K key, V value){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        //if element is already present there, change it's value
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        //if element is not present
        //create a newNode and add it to the head.front of LL
        head=buckets.get(bucketIndex);
        MapNode<K,V> newNode=new MapNode<K,V>(key, value);
        newNode.next=head;
        buckets.set(bucketIndex, newNode);
        //increase the count of elements
        count++;
        double loadFactor = (1.0*count)/numBuckets;
        if(loadFactor>0.7){
            reHash();
        }
    }
}
