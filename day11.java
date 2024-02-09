//DAY 11
//class Person{
//
//    public String name;
//    public int age;
//    public int number;
//
//    public Person(){
//        System.out.println("From Constructor method");
//        name = "Hello";
//        age = 20;
//    }
//    //parameterized constructor
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public Person(String name, int age,int number){
//        this.name = name;
//        this.age = age;
//        this.number= number;
//    }
//    public Person(Person p){
//        this.name=p.name;
//        this.age=p.age;
//        this.number=p.number;
//    }
//
//}
//
//class online{
//    public static void main(String a[]){
//        //Constructors
//        Person p1 = new Person("Anuska",5);
//        Person p2 = new Person();
//        Person p3 = new Person("Polly",22,123);
//        Person p4=new Person(p3);
//        System.out.println(p1.age);
//        System.out.println(p2.age);
//        System.out.println(p3.age + p3.name+ p3.number);
//        System.out.println(p4.age + p4.name+ p4.number);
//
//    }
//class Car {
//    private String color;
//    private String model;
//    private int year;
//    private boolean rentalStatus;
//    public Car(String color, String model, int year) {
//        this.color = color;
//        this.model = model;
//        this.year = year;
//        this.rentalStatus = false; }
//
//    public String getColor() {
//        return color;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public boolean isRented() {
//        return rentalStatus;
//    }
//    public void rentCar() {
//        rentalStatus = true;
//    }
//    public void returnCar() {
//        rentalStatus = false;
//    }
//}
//public class online{
//    public static void main(String[] args) {
//        Car car1 = new Car("Red", "Toyota Camry", 2020);
//        Car car2 = new Car("Blue", "Honda Accord", 2019);
//        car1.rentCar();
//        System.out.println("Car 1 Details:");
//        System.out.println(car1.getColor());
//        System.out.println(car1.getModel());
//        System.out.println(car1.getYear());
//        System.out.println(car1.isRented());
//
//        System.out.println();
//
//        System.out.println("Car 2 Details:");
//        System.out.println( car2.getColor());
//        System.out.println(car2.getModel());
//        System.out.println(car2.getYear());
//        System.out.println(car2.isRented() );
//    }
//}

////STRINGS
//class online{
//    public static void main(String []args){
//        char data[] = {'a', 'b', 'c'};
//        String str = new String(data);
//        System.out.println(str);
//        String name="hello";
//        System.out.println(name);
//
//    }
//}
