package lesson11;

public class Car {
    String color;
    String motor;
    int door;
}

class CarTest {

    void changeDoors(Car car, int door) {
        car.door = door;}

    void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;}

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Blue";
        car1.motor = "V6";
        car1.door = 2;
        Car car2 = new Car();
        car2.color = "Black";
        car2.motor = "V8";
        car2.door = 4;

        CarTest ct = new CarTest();
        ct.changeDoors(car1, 6);
        ct.changeDoors(car2, 3);
        ct.changeColor(car1,car2);
        System.out.println("цвет 1 машины: " + car1.color + ", " + "двигатель 1 машины: " + car1.motor + ", " + "количество дверей 1 машины: " + car1.door);
        System.out.println("цвет 2 машины: " + car2.color + ", " + "двигатель 2 машины: " + car2.motor + ", " + "количество дверей 2 машины: " + car2.door);
    }
}
