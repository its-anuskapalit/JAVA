
//Day20
//interface Food{
//    void eat();
//}
//class Nonveg implements Food{
//    @Override
//    public void eat() {
//        System.out.println("only non veg food");
//    }
//}
//class Veg implements Food{
//    @Override
//    public void eat() {
//        System.out.println("only veg food");
//    }
//}
//class online{
//    public  static void main(String args[]){
//        Food nonvegFood = new Nonveg();
//        nonvegFood.eat();
//
//        Food vegFood = new Veg();
//        vegFood.eat();
//
//
//    }
//}
............................................................................................................................
//@FunctionalInterface
//interface A{
//    void print();
//}
//class B implements A{
//    public  void print(){
//        System.out.println("From print");
//    }
//}
//class online{
//    public  static  void main(String args[]){
//        A obj=new B();
//        obj.print();
//
//    }
//}
..........................................................................................................................................
//@FunctionalInterface
//interface A{
//    void print();
//}
//
//class online{
//    public  static  void main(String args[]){
//        A obj =() -> {System.out.println("From main"); };
//        obj.print();
//
//    }
//}
...............................................................................................................................

interface A {
    boolean Prime(int n);
}
public class online {
    public static void main(String[] args) {
        A obj = (int n) -> {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int n = 27;
        if (obj.Prime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}
