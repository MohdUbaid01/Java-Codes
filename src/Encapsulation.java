public class Encapsulation {

    public static void printHello(){
        System.out.println("Hello from Ubaid");
    }
    public static void main(String[] args) {
//        Person p1=new Person();
//        Person p2=new Person();
//        p1.setAge(20);
//        int AGE=p1.getAge();
//        System.out.println(AGE);
//        p1.Count=50;
//        System.out.println(p2.Count);
       Encapsulation.printHello();

    }
}

class Person{
    public static int Count;
    private int age;
   private String name;
   public void setAge(int age){
       this.age=age;
   }
   public int getAge(){

       return age;
   }
}
