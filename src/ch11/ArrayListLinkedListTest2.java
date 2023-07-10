package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(1000000);
        LinkedList linkedList = new LinkedList();
        add(arrayList);
        add(linkedList);

        System.out.println("접근 시간 테스트");
        System.out.println("arrayList = " + access(arrayList));
        System.out.println("linkedList = " + access(linkedList));

    }

    static void add(List list){
        for(int i=0; i<100000; i++){
            list.add(i+"");
        }
    }

    static long access(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            list.get(i);        }
        long end = System.currentTimeMillis();
        return end - start;
    }



}
