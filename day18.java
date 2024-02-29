//==============ABSTRACTION=====================
/*Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.*/
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat");
    }

    void sleep() {
        System.out.println("Lion sleeps in grasslands");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats also meat");
    }
    void sleep() {
        System.out.println("Tiger sleeps in dense forests");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass");
    }
    void sleep() {
        System.out.println("Deer sleeps in fields");
    }
}
public class online {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat();
        lion.sleep();
        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        Animal deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
//=============================================================================================================================
/*Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape,
  and override the calculateArea() method to calculate and return the area of each shape.*/

