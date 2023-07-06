package ch14;

import java.util.function.Function;

public class LambdaEx5 {
    public static void main(String[] args) {
        Function<String,Integer> f = Integer::parseInt; //메서드 참조
        int num = f.apply("100");
        System.out.println(num+100);

        Function<Integer,int[]> f2 = int[]::new;
        int leng = f2.apply(100).length;
        System.out.println("생성한 f2 배열의 길이: "+leng);
    }
}
