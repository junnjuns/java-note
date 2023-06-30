package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx5 {
    public static void main(String[] args) {
        HashSet a = new HashSet();
        HashSet b = new HashSet();
        HashSet kyo = new HashSet();
        HashSet hap = new HashSet();
        HashSet cha = new HashSet();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        System.out.println("setA: "+a.toString());

        b.add("4");
        b.add("5");
        b.add("6");
        b.add("7");
        b.add("8");
        System.out.println("setB: "+b.toString());

        Iterator it = b.iterator();
        while (it.hasNext()){
            Object tmp = it.next(); //contains메서드의 매개변수 타입은 Object이기 때문에 Object로 변환
            if(a.contains(tmp)){
                kyo.add(tmp);
            }
        }

        it = b.iterator();
        while (it.hasNext()){
            hap.add(it.next());
        }
        it = a.iterator();
        while (it.hasNext()){
            hap.add(it.next());
        }

        it = a.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if (!b.contains(tmp)){
                cha.add(tmp);
            }
        }


        System.out.println("교집합"+ kyo);
        System.out.println("합집합"+ hap);
        System.out.println("차집합"+ cha);
    }
}
