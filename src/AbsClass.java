public class AbsClass {
    public static void main(String[] args) {
    Car car=new Car();
    car.breaks(5);
    car.accelerate();
    car.honks();
    }
}

abstract class Vehicle{
    abstract void accelerate();
    abstract int breaks(int breaks);
    void honks(){
        System.out.println("Vehicle is honking");
    }
}

class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("car is Accelerated");
    }


    @Override
    int breaks(int breaks) {
        System.out.println("Breaks are applied");
        return breaks;
    }
}
