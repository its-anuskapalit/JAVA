//DAY 15
//INHERITANCE
/*Single inheritance: A subclass inherits from only one superclass.
Multilevel inheritance: A subclass inherits from a superclass, and then another subclass inherits from that subclass.
Hierarchical inheritance: Multiple subclasses inherit from a single superclass.
Multiple inheritance (not directly supported in Java): A subclass inherits from multiple superclasses. This can be simulated using interfaces in Java.*/

//==============SINGLE=====================
class Animal{
    //protected can acess private cannot
    protected void eat(){
        System.out.println("I can eat");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("I can bark");
    }

}
class online{
    public  static  void  main(String args[]){
        Dog ob=new Dog();
        ob.bark();
        ob.eat();
    }
}
//=============MULTILEVEL================
class Animal{
   void eat(){
       System.out.println("I can eat");
   }

}
class Dog extends Animal{
   void bark(){
       System.out.println("I can bark");
   }

}
class babyDog extends Dog{
   void weep(){
       System.out.println("I can weep");
   }
}
class online{
   public  static  void  main(String args[]){
       babyDog ob=new babyDog();
       ob.weep();
       ob.bark();
       ob.eat();
   }
}
//=============HIERARCHICAL================
class Animal{
    //protected can acess private cannot
    protected void eat(){
        System.out.println("I can eat");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("I can bark");
    }

}
class Tiger extends Animal{
    void roar(){
        System.out.println("I can roar");
    }
}
class online{
    public  static  void  main(String args[]){
        Tiger ob=new Tiger();
        ob.roar();
        ob.eat();
        Dog obj=new Dog();
        obj.bark();;
        obj.eat();
    }
}
