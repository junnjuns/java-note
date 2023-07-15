package ch12;


public class ExGeneric {
    public static void main(String[] args) {
        People<String, Integer> people1 = new People<>("Kim",30);
        People<String, Integer> people2 = new People<>("Han", 30);

        boolean result = people1.compare(people1,people2);
        System.out.println("result = " + result);

    }
}


class People<T,M>{
    private T name;
    private M age;

    People(T name, M age){
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    public<T,V> boolean compare(People<T,V> p1, People<T,V> p2){
        boolean nameCompare = p1.getName().equals(p2.getName());
        boolean ageCompare = p1.age.equals(p2.getAge());
        return nameCompare && ageCompare;
    }
}
