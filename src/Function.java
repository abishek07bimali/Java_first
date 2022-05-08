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

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        helloInt();
    }
    public static void helloInt() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float prn=scanner.nextFloat();

        System.out.println("Enter the time: ");
        float time=scanner.nextFloat();


        System.out.println("Enter the rate: ");
        float rate=scanner.nextFloat();

        float interest =(prn*time*rate)/100;
        System.out.println(interest);
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

class Fun3{
    public static void main(String[] args) {
//        Function function=new Function();
//        function.subtraction();
        subtraction(10,12);
    }
    public static void subtraction(int a,int b){
//        int a=10;
//        int b=20;
        int sub=a-b;
        System.out.println(sub);
    }
}

