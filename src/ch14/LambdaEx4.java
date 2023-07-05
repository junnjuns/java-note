package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(i);
        }

        //list 모든 요소 출력
        list.forEach(i -> System.out.print(i+","));
        System.out.println();

        //에서 2 또는 3의 배수 제거
        list.removeIf(i -> i%2==0 || i%3==0);
        System.out.println(list);

        list.replaceAll(i -> i*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        map.forEach((k,v)-> System.out.print("{"+k+","+v+"}, "));
    }
}
