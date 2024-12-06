public class InnerClassAndNestedClass {
    class Toy{
        int price;
    }

    static class Ubaid{
        String name;
    }

    public static void main(String[] args) {
        InnerClassAndNestedClass obj=new InnerClassAndNestedClass();
        Toy toy=obj.new Toy();
        toy.price=400;
        System.out.println(toy.price);

        Ubaid u=new InnerClassAndNestedClass.Ubaid();
        u.name="Hello Ubaid";
    }
}
