//day26
//LINKEDLIST(List, Queue and Deque Interface)
//(prev add+data+next add)
//provides doubly-linkedlist
//whenever element is added,prev and next changed

//ARRAYLIST(list)
//stores single value
//provides a resizeable array
//whenever element is added, prev next shift

import java.util.LinkedList;

class online{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("mercury");
        ll.add("venus");
        ll.add("earth");
        ll.add("mars");
        System.out.println(ll);
        ll.add(1,"jupiter");
        System.out.println(ll);
    }
}
//-----------------------------------------------------------------------------
