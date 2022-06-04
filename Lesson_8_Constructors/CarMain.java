package Lesson_8_Constructors;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang Bullitt","green", 1969,335,true);
        Car car2 = new Car("Mustang Mach1","Yellow",true);
        Car car3 = new Car("Mustang Shelby GT500","Silver",1967,355);
        Car car4 = new Car("1967 Shelby GT500 Super Snake",1967,355,true);
        Car car5 = new Car();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

    }
}
