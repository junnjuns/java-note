package ch3;

class Car{
    String name;
    Car(String name) {
        this.name = name;
    }
}
public class Ex01 {
    public static void main(String[] args) {

        Car car1 = new Car("김준형");
        Car car2 = new Car("김준형");
        if (car1 == car2) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }


        String car3 = new String("김준형");
        String car4 = new String("김준형");
        if (car3 == car4) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }

        String car5 = "김준형";
        String car6 = "김준형";
        if (car5 == car6) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }

        String car7 = "김준형";
        String car8 = new String("김준형");
        if (car7 == car8) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }
}
