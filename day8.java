//DAY8

/*OBJECTS:: Attributes+Behaviour
PHONE_Attributes =company, color,RAM
PHONE_Behaviour= auto discount, record
CLASS(a blueprint for object)
 */
class Add{
    public static void addition(int a,int b){
        System.out.println(a+b);
    }
    public static double addition(double a,double b){
        return (a+b);
    }
    public static int addition(int a,int b,int c){
        return (a+b+c);
    }
}
class online{
    public  static void main(String args[]){
        int a=5;
        int b=10;
        System.out.println(a+b);
        Add ob= new Add();
        ob.addition(4,5);
        System.out.println(ob.addition(4.5,5.6));
        System.out.println(ob.addition(4,5, 6));

    }
}
//============================================================================
