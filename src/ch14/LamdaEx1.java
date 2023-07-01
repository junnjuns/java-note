package ch14;

@FunctionalInterface
interface MyFunction {  //함수형 인터페이스
    void run();
}

public class LamdaEx1 {
    static void execute(MyFunction f) { //매개변수가 함수형 인터페이스 타입인 메서드
        f.run();
    }

    static MyFunction getMyFunction() { //반환타입이 함수형 인터페이스 타입인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");   //람다식으로 run() 구현
        MyFunction f2 = new MyFunction() {  //익명 클래스로 run() 구현
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);    //메서드의 매개변수가 함수형 인터페이스 타입이면 람다식을 참조하는 참조변수를 매개변수로 지정해야한다. > f1
        execute(() -> System.out.println("run()")); //참조변수 없이 직접 람다식을 매개변수로 지정
    }
}
