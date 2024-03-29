//day25
//SETS (HASH,ENUM, LINKEDHASH, TREE)
//sets cannot contain duplicate elements

import java.util.HashSet;
import java.util.Set;
class online{
    public static void main(String args[]){
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        System.out.println("Set 1: "+s1);
        Set<Integer> s2 = new HashSet<>();
        s2.add(2);
        s2.add(3);
        System.out.println("Set 2: "+s2);
        s2.addAll(s1);
        System.out.println("Union: "+s2);


    }
}
//---------------------------------------------------------------------------------------
import java.util.*;
class online{
    public static void main(String args[]){
        Set<Integer> s1 = new HashSet<>(10,0.5F);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        Iterator<Integer> i=s1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
//------------------------------------------------------------------------------
import java.util.*;
class online{
    public static void main(String args[]){
        Set<Integer> s1 = new HashSet<>(10,0.5F);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        System.out.println("Set 1: "+s1);
        HashSet<Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        System.out.println("Set 2: "+s2);
        // s2.retainAll(s1);
        // System.out.println("Common in Set : "+s2);
      s2.removeAll(s1);
        System.out.println(s2);
      
    }
}
//------------------------------------------------------------
// Suppose you are given two sets of integers, A and B, represented as HashSet objects in Java. You are required to implement a Java program that performs the following operations:

// Calculate the intersection of sets A and B.
// Determine if set A is a subset of set B.
// Calculate the union of sets A and B.
// Your program should include the following methods:

// calculateIntersection(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns a new HashSet containing the intersection of setA and setB.
// isSubset(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns true if setA is a subset of setB, otherwise returns false.
// calculateUnion(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns a new HashSet containing the union of setA and setB.
import java.util.*;

class Set {
    public  HashSet<Integer> Intersection(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        return intersection;
    }

    public boolean Subset(HashSet<Integer> setA, HashSet<Integer> setB) {
        return setB.containsAll(setA);
    }

    public HashSet<Integer> Union(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        return union;
    }
}

    class online {
        public static void main(String[] args) {
            Set ob = new Set();
            HashSet<Integer> s1 = new HashSet<>();
            s1.add(1);
            s1.add(2);
            s1.add(3);
            s1.add(4);
            System.out.println("Set 1: " + s1);
            HashSet<Integer> s2 = new HashSet<>();
            s2.add(3);
            s2.add(4);
            s2.add(5);
            System.out.println("Set 2: " + s2);

            System.out.println("Intersection " + ob.Intersection(s1, s2));
            System.out.println("Subset " + ob.Subset(s1, s2));
            System.out.println("Union " + ob.Union(s1, s2));
        }
    }
