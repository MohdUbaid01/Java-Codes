public class AnonymousClass {
  OuterClass obj=new OuterClass(){
      void sing(){

      }

      public void outerMethod(){

      }
  };

  SuperInterface ob2=new SuperInterface() {

      public void interfaceMethod() {
          System.out.println("This is an interface method of anonymous class");
      }
  };

    public static void main(String[] args) {
        SuperInterface ob2=new SuperInterface() {

            public void interfaceMethod() {
                System.out.println("This is an interface method of anonymous class");
            }
        };
    }
}


class OuterClass{
    public void outerMethod(){
        
    }
}

interface SuperInterface{
    void interfaceMethod();
}