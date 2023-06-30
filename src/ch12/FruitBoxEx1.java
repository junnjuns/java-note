package ch12;

import java.util.ArrayList;

class Fruit{public String toString(){return "Fruit";}}
class Apple extends Fruit{public String toString(){return "Apple";}}
class Grape extends Fruit{public String toString(){return "Grape";}}
class Toy{public String toString(){return "Toy";}}
public class FruitBoxEx1 {
    public static void main(String[] args) {
    Box<Fruit> fruitBox = new Box<>();
    Box<Apple> appleBox = new Box<>();
    Box<Grape> grapeBox = new Box<>();
    Box<Toy> toyBox = new Box<>();

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());

    appleBox.add(new Apple());
//    appleBox.add(new Grape());    타입이 맞지 않기 때문에 오류
    toyBox.add(new Toy());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("toyBox = " + toyBox);
    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
    }

    T get(int i){
        return list.get(i);
    }

    int size(){
        return list.size();
    }


    @Override
    public String toString(){
        return list.toString();
    }
}
