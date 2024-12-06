public class ExceptionHandling {
    public static void main(String[] args) {
        int a[] = new int[50];
        System.out.println(a[0]);
        System.out.println("Hello Guys!!");

        try {
            int result=5/0;
            System.out.println(a[51]);

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Try to access the out of Bound elements");
        }
//        catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

        System.out.println("Bye Guys");


    }
}
