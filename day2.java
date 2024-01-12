//Day 2
//typecasting
//Widening Casting (automatically) - converting a smaller type to a larger type size. byte -> short -> char -> int -> long -> float -> double.
//Narrowing Casting (manually) - converting a larger type to a smaller size type. double -> float -> long -> int -> char -> short -> byte.
class online{
    public static void main(String args[]){
        int num1=5;
        double num2=num1; ////automatically
        System.out.println(num2);
        double num3=15.5;
        int num4=(int)num3; //manually
        System.out.println(num4);

    }
}
