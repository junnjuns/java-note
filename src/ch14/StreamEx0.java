package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx0 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::print);   //forEach() 최종연산

        System.out.println();

        String[] strArr = new String[]{"a","b","c","d","e"};    //배열
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::print);

        System.out.println();

        Integer[] integers = {1,2,3,4,5};
        Stream<Integer> integerStream = Arrays.stream(integers);  //Integer
        integerStream.forEach(System.out::print);

        System.out.println();

        int[] intArr ={1,2,3,4,5};
        IntStream intStream2 = Arrays.stream(intArr);   //IntStream
        System.out.println(intStream2.max());


        String[] str1 = {"123","456","789"};
        String[] str2 = {"aaa","bbb","ccc"};
        Stream<String> s1 = Stream.of(str1);
        Stream<String> s2 = Stream.of(str2);
        Stream<String> concat = Stream.concat(s1, s2);
        concat.forEach(System.out::print);

    }
}
