class Vehicle{
    String brand;
    int speed;

    void showVehicle(){
        System.out.println("brand:"+brand);
        System.out.println("speed:"+speed);
    }
}
class Car extends Vehicle{
    int price;

    void showPrice(){
        System.out.println("price:"+price);
    }
}



public class Main1 {

    public static void main(String[] args) {
        Car car =new Car();

        car.brand="bmw";
        car.price=80000000;
        car.speed = 260;

        car.showVehicle();
        car.showPrice();
    }

}
