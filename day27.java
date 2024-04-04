//day27

import java.util.PriorityQueue;

class online{
   public static void main(String args[]){
       PriorityQueue<Integer> pq1= new PriorityQueue<>();
       pq1.add(8);
       pq1.add(3);
       pq1.add(1);
       System.out.println(pq1);
       pq1.add(4);
       pq1.add(7);
       System.out.println(pq1);
   }
}
//-------------------------------------------------------------------------------
import  java.util.*;
class online{
   public static void main(String args[]){
       ArrayList<String> list=new ArrayList<>();
       list.add("a");
       list.add("a1");
       list.add("a2");
       list.add("a3");
       System.out.println(list);
       String arr[]=new String[list.size()];
       list.toArray(arr);
       for(String item:arr){
           System.out.println(item);
       }

   }
}
//---------------------------------------------------------------------------------
import  java.util.*;
class online{
    public static void main(String args[]){
        String arr[]={"a","a1","a2","a3"};
        for(String item:arr){
            System.out.println(item);
        }
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
//---------------------------------------------------------------------------
import java.util.*;

public class online {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("a1");
        list.add("a2");
        list.add("a3");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
//-----------------------------------------------------------
import java.util.*;

public class online {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");
        System.out.println(list.subList(2, 4));
    }
}
//----------------------------------------------------------------
