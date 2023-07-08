package ch12;

import java.util.ArrayList;

public class FruitBoxEx2 {

    public static void main(String[] args) {
        Box2<Fruit2> fruitBox2 = new Box2<>();
        Box2<Apple2> appleBox2 = new Box2<>();
        Box2<Toy2> toyBox2 = new Box2<>();

        fruitBox2.add(new Fruit2());
        fruitBox2.add(new Apple2());

        appleBox2.add(new Apple2());
        appleBox2.add(new Apple2());

        toyBox2.add(new Toy2());

        System.out.println(fruitBox2);
        System.out.println(appleBox2);
        System.out.println(toyBox2);

    }
}

class Box2<T>{
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

    public String toString(){
        return list.toString();
    }
}

class Fruit2{ public String toString(){return "Fruit";}}
class Apple2 extends Fruit2{ public String toString(){return "Apple";}}

class Grape2 extends Fruit2{public String toString(){return "Grape";}}

class Toy2{public String toString(){return "Toy";}}
