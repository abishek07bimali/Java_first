/* Access- modifier Static/non-static return Type method name(parameter){
----body---
 }


 Access modifier----
 public
 private
 protected
 default

Static should be used while you want to access any function without the use of object.


NO any key word is required if you want to access the function by using the object.


If your function returns certain data type then you must specify the data type of the returned value
for example: int,double,float,String,long,char,boolean,etc,.


If you function returns nothing then you must use void keyboard.

Name of the function should be always in perfect camel case or its initials should
always Start from lowercase.


parameter of the function:
 parameterized and return type
 parameterless and return type
 parameterized and non-return type
 parameterless and non-return type

 */

import java.util.Arrays;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        System.out.println(helloInt());
    }
    public static float helloInt() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float prn=scanner.nextFloat();

        System.out.println("Enter the time: ");
        float time=scanner.nextFloat();


        System.out.println("Enter the rate: ");
        float rate=scanner.nextFloat();

        float interest =(prn*time*rate)/100;
        return interest;
    }
}


class Fun1{
    public static void main(String[] args) {
        System.out.println(addition());
    }
    public  static int addition(){
        int a=10;
        int b=10;
        int sum=a+b;
        return sum;
    }
}

class Fun2{
    public static void main(String[] args) {

        subtraction();
    }

    public static void subtraction(){
        int a=10;
        int b=20;
        int sub=a-b;
        System.out.println(sub);
    }
}

class Fun3 {
    public static void main(String[] args) {
//        Function function=new Function();
//        function.subtraction();
        subtraction(10, 12);
    }

    public static void subtraction(int a, int b) {
//
        int sub = a - b;
        System.out.println(sub);
    }
}

class Fun4 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("enter he radius: ");

        subtraction(scanner.nextInt());
    }

    public static void subtraction(int radius) {
//
        float sub = 22/7*(radius*radius);
        System.out.println(sub);
    }
}

class Fun5{
    public static void main(String[] args) {
        System.out.println(helloInt());
    }
    public static float helloInt() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        float A=scanner.nextFloat();

        System.out.println("Enter the Second number: ");
        float AB=scanner.nextFloat();


        System.out.println("Enter the third number: ");
        float ABC=scanner.nextFloat();

        float mul =A*AB*ABC;
        return mul;
    }
}
class Fun6{
    public static void main(String[] args) {
        System.out.println(helloInt());

    }
    public static float helloInt() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        do {
            System.out.println("Enter the number: ");
            float A = scanner.nextFloat();
            count++;
            float mul=A*A*A;
            return mul;
        }
        while (count <= 3);
}}



class Fun7{
    public static void main(String[] args) {
        System.out.println(prime());
    }
    public static  String prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int A = scanner.nextInt();
        int count=0;
        for (int i=1;i<=A;i++){
            if(A%i==0){
                count++;
            }}
        if (count==2){
            return "prime";
        }
        else{
            return "Not prime" ;
        }
}}


class Prime{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the starting number: ");
        int Num1=scanner.nextInt();
        System.out.println("enter the ending number: ");
        int Num2=scanner.nextInt();
//        Function function=new Function();
        prime(Num1,Num2);
      }
    public static  void prime(int A,int B){
        for (int i=A;i<=B;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }}
            if (count==2){
                System.out.print(i+" ");
            }
        }

    }
}

//WAP to find  sum of multiples of 5 and 11 which are present in between A and B.
class Multiple{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the starting number: ");
        int Num1=scanner.nextInt();
        System.out.println("enter the ending number: ");
        int Num2=scanner.nextInt();
//        Function function=new Function();
        System.out.println(sumMultiples(Num1,Num2));
    }
    public static  int  sumMultiples(int A,int B) {
        int sum = 0;
            for (int j=A;j<=B;j++){
                if (j% 5 == 0 && j % 11 == 0) {
                    sum+=j;
                }
            }

        return sum;
    }}

class Main{
    public static void main(String[] args) {
        add();
        sub();
    }
    private static void add(){
        sub();
        B A=new B();
//        A B=a;
//        System.out.println(Arrays.toString(B));
    }
    public static int sub(){
        int A=2;
        int b=3;
        int sub=(A-b);
//        System.out.println(sub);
        return A;
    }
}

class A {
    int a = 10;
}
class B {
    public static void main(String args[]) {
        A a = new A();
        System.out.println("I live in A " + a.a);
    }
}

