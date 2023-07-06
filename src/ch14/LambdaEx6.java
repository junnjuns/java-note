package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaEx6 {
    public static void main(String[] args) {
//        Supplier<MyClass> s = MyClass::new;
        Function<Integer,MyClass> f = MyClass::new;
        MyClass mc1 = f.apply(100);
        System.out.println(mc1.iv);

        MyClass mc2 = f.apply(300);
        System.out.println(mc2.iv);
    }
}

class MyClass{
    int iv;
    MyClass(int iv){
        this.iv = iv;
    }
}
