//Day 16
class Calculate{
    int a;
    Calculate(int n){
        a=n;
    }
    void area(){
        int area=a*a;
        System.out.println(("Area is:"+area));
    }
    void peri(){
        int p=a*4;
        System.out.println(("Perimenter is:"+p));
    }
}

class online{
    public static void main(String args[]){
//        Calculate c1=new Calculate(5);
//        c1.area();
//        c1.peri();
        new Calculate(5).area();
        new Calculate(5).peri();//anomalous object

    }

}
//................................................................................
//instanceof is use to check if the object is an object of a particular class or not
class online{
    public static void main(String args[]){
        String name="hello";
        boolean a= name instanceof String;
        System.out.println(a);
        online obj=new online();
        boolean b=obj instanceof online;
        System.out.println(b);

    }
}
//.................................................................................
class Animal{

}
class Dog extends Animal{

}
class online{
    public static void main(String args[]){
       Dog d1=new Dog();
       boolean b= d1 instanceof Animal; //true for both Animal Dog
       System.out.println(b);
    }
}
