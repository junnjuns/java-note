package ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123").filter(x -> x.length() > 0).map(Integer::parseInt).get();
        int result2 = Optional.of("").filter(x ->x.length() > 0).map(Integer::parseInt).orElse(-1);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.print("result3 = "+x));
        System.out.println();

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();

        System.out.println(optInt1.isPresent());
        System.out.println(optInt2.isPresent());
        System.out.println(optInt1.getAsInt());
        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);

        Optional<String> opt1 = Optional.ofNullable(null);  //null 저장
        Optional<String> opt2 = Optional.empty();   //빈 객체 저장

        System.out.println("opt1 = " + opt1);
        System.out.println("opt1 = " + opt1);
        System.out.println(opt1.equals(opt2));
    }
}
