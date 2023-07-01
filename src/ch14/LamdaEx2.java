package ch14;

@FunctionalInterface
interface MyFunction2{
    void MyMethod();
}
public class LamdaEx2 { //람다식의 형변환 예제
    public static void main(String[] args) {
        MyFunction f = () ->{}; //(MyFunction) () -> {}  람다식과 MyFunction의 타입이 다르기 때문에 형변환
        Object obj = (MyFunction)(()->{});
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction)()->{});
        System.out.println(((Object)(MyFunction)(()->{})).toString());
    }
}
