package ch11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int) (Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set.toString());     //TreeSet 이기 때문에 따로 정렬하지 않아도 이미 정렬되어 있다.
    }
}
