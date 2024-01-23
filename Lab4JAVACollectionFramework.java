/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.java.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author suha9
 */
public class Lab4JAVACollectionFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Ex1:
//        HashSet<String> h1_set = new HashSet<String>();
//        h1_set.add("Red");
//        h1_set.add("White");
//        h1_set.add("Pink");
//        h1_set.add("Yellow");
//        h1_set.add("Black");
//        h1_set.add("Green");
//       System.out.println("THe Hash Set: "+h1_set);
       

//EX2:
//  HashSet<String> h2_set = new HashSet<String>();
//        h2_set.add("Red");
//        h2_set.add("White");
//        h2_set.add("Pink");
//        h2_set.add("Yellow");
//        h2_set.add("Black");
//        h2_set.add("Green");
//        System.out.println("Original Hash Set: "+h2_set);
//
//        ArrayList<String> a1_List = new ArrayList<String>(h2_set);
//        System.out.println("ArrayList contains: "+a1_List);
//        
////EX3:
//         HashSet<String> h1 = new HashSet<String>();
//        h1.add("Red");
//        h1.add("White");
//        h1.add("Black");
//        h1.add("Green");
////        
//         HashSet<String> h2 = new HashSet<String>();
//        h2.add("Red");
//        h2.add("pink");
//        h2.add("Black");
//        h2.add("Oringe");
////        
//        System.out.println("First HashSet content: "+h1);
//        System.out.println("Second HashSet content: "+h2);
////        
//        h1.retainAll(h2);
//        System.out.println(" HashSet content: "+h1);
        
//EX4:
//        TreeSet<String> tree = new TreeSet<String>();
//        tree.add("Black");
//        tree.add("Green");
//        tree.add("Pink");
//        tree.add("Red");
//        tree.add("Oringe");
////        
//        System.out.println("Original tree set: "+tree);
//        System.out.println("Size of the tree set: "+tree.size()); 
   

//EX5:
//   TreeSet<Integer> tree_num = new TreeSet<Integer>();
//   tree_num.add(50);
//   tree_num.add(15);
//   tree_num.add(60);
//   tree_num.add(17);
//   tree_num.add(20);
//   tree_num.add(80);
//   tree_num.add(78);
////   
//   System.out.println("Strictly greater than 76: "+tree_num.higher(76));
////   
//      TreeSet<Integer> tree_num1 = new TreeSet<Integer>();
//   tree_num1.add(5000);
//   tree_num1.add(1577);
//   tree_num1.add(603);
//   tree_num1.add(170);
//   tree_num1.add(200);
//   tree_num1.add(80);
//   tree_num1.add(36);
////   
//   System.out.println("Strictly greater than 31: "+tree_num1.lower(76));
//   
//EX6:
// ArrayList<String> array = new ArrayList<String>();
// array.add("Red");
// array.add("Green");
//array.add("Black");
//array.add("White");
//array.add("Pink");
//
//System.out.println("Original array List: "+array);
//System.out.println("Print using index of an element:");
//for(int i=0; i<array.size();i++)
//  System.out.println(array.get(i));
//
//

//Ex7:
 LinkedList<String> array = new LinkedList<String>();
 array.add("Red");
 array.add("Green");
 array.add("Black");
 array.add("Pink");
 array.add("Oringe");

System.out.println("Linked List before shuffling:\n"+array);

Collections.shuffle(array);

System.out.println("Linked List after shuffling:\n"+array);
    }
}
