//Day 3
//+ - * / %
//a=a+1 a+=1 a++
class lpu{
    public static void main(String args[]){
        int num1=5;
        double num2=10.5;
        System.out.println("The sum is: "+(num1+num2));
        System.out.println("The diiference is: "+(num1-num2));
        System.out.println("The product is: "+(num1*num2));
        System.out.println("The division is: "+(num1/num2));
        System.out.println("The modulus is: "+(num1%num2));
    }
}

import java.util.*;
class lpu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age;
        age = sc.nextInt();
        if (age >= 18 && age <= 60) {
            System.out.println("can skydrive.");
        } else {
            System.out.println("can not skydrive.");
        }
    }
}
