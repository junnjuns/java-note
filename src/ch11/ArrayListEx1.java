package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));

        listPrint(list1,list2);

        Collections.sort(list1);
        Collections.sort(list2);

        listPrint(list1,list2);

        System.out.println("containsAll = " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");

        listPrint(list1,list2);

        list2.set(3,"AA");

        listPrint(list1,list2);

        System.out.println("retainAll = " + list1.retainAll(list2));

        listPrint(list1,list2);

        for(int i =0; i<list1.size(); i++){
            list2.remove(list1.get(i));
        }
        listPrint(list1,list2);
    }

     static void listPrint(ArrayList list1, ArrayList list2){
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
         System.out.println();
    }
}
