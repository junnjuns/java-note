package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx0 {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>(10); //초기 용량 설정
        ArrayList<Integer> integers3 = new ArrayList<>(integers1); // 다른 Collection 값으로 초기화
        ArrayList<Integer> integers4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("integers1 = " + integers1);
        System.out.println("integers2 = " + integers2);
        System.out.println("integers3 = " + integers3);
        System.out.println("integers4 = " + integers4);

        System.out.println();
        System.out.println();

        integers1.add(5);
        integers1.add(0,4);
        integers1.add(6);
        integers1.add(7);
        integers1.add(10);
        integers1.add(8);
        integers1.add(9);

        integers2.add(6);
        integers2.add(6);
        integers2.add(6);
        System.out.println("integers1 = " + integers1);
        System.out.println("integers2 = " + integers2);

        System.out.println();

        integers1.set(1,10);
        System.out.println("-1번째 인덱스 10으로 변경-");
        System.out.println("integers1 = " + integers1);

        System.out.println();

        integers1.remove(Integer.valueOf(4));   //값 4를 삭제
        System.out.println("-값 4 삭제-");
        System.out.println("integers1 = " + integers1);
        System.out.println("-0번째 인덱스 삭제-");
        integers1.remove(0);    // 0번째 인덱스를 삭제
        System.out.println("integers1 = " + integers1);

        System.out.println();

        int rm = integers1.remove(1);
        System.out.println("1번째 인덱스 삭제");
        System.out.println("integers1 = " + integers1);
        System.out.println("삭제된 데이터 :" + rm);

        System.out.println();

        System.out.println("integers2 = " + integers2);
        System.out.println(integers2.removeAll(integers1));
        System.out.println("integer1의 요소들을 integers2에서 모두 삭제");
        System.out.println("integers2 = " + integers2);

        System.out.println();

        System.out.println("integers1 = " + integers1);
        boolean check1 = integers1.contains(1);
        System.out.println("integers1에 값 1이 존재하나?");
        System.out.println("check1 = " + check1);
        boolean check2 = integers1.contains(10);
        System.out.println("integers1에 값 10이 존재하나?");
        System.out.println("check2 = " + check2);

        System.out.println();

        System.out.println("integers1 = " + integers1);
        System.out.println("오름차순");
        Collections.sort(integers1);
        System.out.println("integers1 = " + integers1);
        System.out.println("내림차순");
        Collections.sort(integers1, Collections.reverseOrder());
        System.out.println("integers1 = " + integers1);

        System.out.println();

        System.out.println("integers1 = " + integers1);
        System.out.println("integers1 요소 모두 삭제");
        integers1.clear();
        System.out.println("integers1 = " + integers1);



    }
}
