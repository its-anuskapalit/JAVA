//Day15
//=============AGGREGATION===============
class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
    class Student{
        String name;
        int id;
        Address address;
        public  Student(String name,int id,Address address){
            this.name=name;
            this.id=id;
            this.address=address;
        }
        void display(){
            System.out.println("NAME IS: "+name+", ID IS: "+id+", ADDRESS (city & state): "+address.city+" "+ address.state);
        }
    }


class online {
    public static void main(String args[]) {
        Address a1=new Address("Kolkata","West Bengal");
        Student s1=new Student("POlly",1,a1);
        s1.display();

    }
}
//......................................................................................................................................................................
/*Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

 Cars have an additional attribute: the number of passengers it can carry.
 Trucks have an additional attribute: the maximum weight they can carry.
 Bicycles do not have any additional attributes.
 Implement the following functionalities:

 Create a superclass named "Vehicle" with attributes:
 identificationNumber (String)
 maxSpeed (double)
 Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
 For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
 Implement a method in each subclass to display the details of the vehicle.
 In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.*/
class Vehicle {
    String id;
    double maxSpeed;

    public Vehicle(String id, double maxSpeed) {
        this.id= id;
        this.maxSpeed = maxSpeed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Identification Number: " + id);
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    private int n;

    public Car(String id, double maxSpeed, int n) {
        super(id, maxSpeed);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n= n;
    }

    @Override
    public void displayDetails() {
        System.out.println("Identification Number: " + getId());
        System.out.println("Maximum Speed: " + getMaxSpeed());
        System.out.println("Number of Passengers: " + n);
    }
}

class Truck extends Vehicle {
    private double maxWeight;

    public Truck(String id, double maxSpeed, double maxWeight) {
        super(id, maxSpeed);
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void displayDetails() {
        System.out.println("Identification Number: " + getId());
        System.out.println("Maximum Speed: " + getMaxSpeed());
        System.out.println("Maximum Weight: " + maxWeight);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String id, double maxSpeed) {
        super(id, maxSpeed);
    }

    @Override
    public void displayDetails() {
        System.out.println("Identification Number: " + getId());
        System.out.println("Maximum Speed: " + getMaxSpeed());
    }
}

public class online {
    public static void main(String[] args) {
        Car car = new Car("C-123", 200.0, 5);
        Truck truck = new Truck("T-456", 150.0, 5000.0);
        Bicycle bicycle = new Bicycle("B-789", 30.0);

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println();

        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println();

        System.out.println("Bicycle Details:");
        bicycle.displayDetails();
        System.out.println();
    }
}
//..................................................................................................
class A{
    public A(){ //a1
        System.out.println("From A");
    }

    public A(int n){ //a2
        System.out.println("From A int");
    }

    public A(int n1, int n2){
        System.out.println("From A int twice");
    }
}

class B extends A{
    public B(){ //B1
        this(5);
        System.out.println("From B");
    }

    public B(int n){ //B2
        System.out.println("From B int");
    }
}

class LPU{
    public static void main(String args[]){
        
        A a1 = new B();
    }
}
