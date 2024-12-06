 public class Interface {
    public static void main(String[] args) {
    monkey m=new monkey();
    m.eats();
    m.walk();
    m.talk();
    }
}

interface Animals{
     void eats();
     void drinks();
     default void talk(){
         System.out.println("Animal is talking");
     }
}

interface pet {
    void walk();
    void drinks();
}

    class monkey implements Animals, pet {

        public void eats() {
            System.out.println("Monkey is eating.....");
        }

        public void drinks() {
            System.out.println("Monkey can drink");
        }


        public void walk() {
            System.out.println("Monkey Can Walk");
        }

        public void talk(){
            System.out.println("Monkey is talking");
        }
    }

