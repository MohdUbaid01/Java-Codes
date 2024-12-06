import java.sql.SQLOutput;

public class Abstraction {
    public static void main(String[] args) {
        Goat g=new Goat();
        g.bark();
        g.legs(4);
        Dog d=new Dog();
        d.bark();
        d.legs(4);

    }
}

abstract class Animal{
    abstract void bark();
    abstract int legs(int leg);
}

class Goat extends Animal{

    void bark() {
        System.out.println("Goat is Barking");
    }


    int legs(int leg) {
        System.out.println("Goat has "+leg+" legs");
        return 0;
    }
}


 class Dog extends Animal{

    void bark() {
        System.out.println("Dog is Barking");
    }


    int legs(int leg) {
        System.out.println("Dog has "+leg+" legs");
        return 0;
    }
}