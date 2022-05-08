import java.util.Scanner;

public class Iteration {
}

class qq1{
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b);
    }}

class Qq2{
    public static void main(String[] args) {
        for (int a=1;a<=5;a+=1){
            System.out.println(a+a);
        }}}

class Qq3{
    public static void main(String[] args) {
        for (int a=1;a<=5;a+=1 ){
            System.out.println("Abishek");
        }}}

class Qq5{
    public static void main(String[] args) {
        for (int a=1;a<=10;a+=1){
            if (a%2!=0)
            System.out.println(a);
        }}}

class Qq6{
    public static void main(String[] args) {
        int count=0;
        for (int a=1;a<=20;a++){
            if (a%3==0){
                count+=1;
            }}
            System.out.println(count);
        }}

class Qq7{
    public static void main(String[] args) {
        int sum=0;
        for (int a=1;a<=10;a++) {
            sum+=a;
        }
            System.out.println(sum);
        }}

class Qq8{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number: ");
        int A=scanner.nextInt();
        int count=0;
        for (int a=1;a<=A;a+=1){
            if (A%a==0){
            count+=1;}}
        if (count==2) {
        System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }}



//loop
class Qq9{
    public static void main(String[] args) {
        for(;;){
            System.out.println("Abishek");
        }
    }
}
class Qq10{
    public static void main(String[] args) {
        for(int a=1;a>0;a++){
            System.out.println("Abishek");
        }}}

class PrimeNumbers {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int AAA=scanner.nextInt();
        String  primeNumbers = "";
        for (int i = 1; i <=AAA; i++) {
            int counter=0;
            for(int num =i; num>=1; num--) {
                if(i%num==0) {
                    counter = counter + 1;
                }}
            if (counter ==2)
            {
                //Appended the Prime number to the String
               primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to "+ AAA +" are :"+primeNumbers);
    }}


class Qq12{
    public static void main(String[] args) {
        for(int a=1;a<=4;a++){
            System.out.println(a);

            for(int b=4;b<=4;b++) {
                System.out.println(b);}}}}




class gov{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the name: ");
        String name=scanner.nextLine();
        System.out.println("enter the age: ");
        float age=scanner.nextFloat();
        System.out.println("enter the marks: ");
        float marks=scanner.nextFloat();
        if (age>=18 || age<21){
            if (marks>=80){
                System.out.println("elligible");}
            else{
                System.out.println("not elligible");}
        }
        else{
            System.out.println("not elligible");
        }}}



//
//
//while

class While{
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            System.out.println(i);
            i+=1;
        }}}

class While1{
    public static void main(String[] args) {
        int i=1;
        while(i<20){
            System.out.println(i);
            i+=2;
        }}}

class While2{
    public static void main(String[] args) {
        int i=2;
        while(i<20){
            System.out.println(i);
            i+=2;
        }}}

class While3{
    public static void main(String[] args) {
        int i=1;

        while (i<=10){
                int j=i*3;
                System.out.println(3+" X "+i+" = "+j);

            i++;

        }}}

class While4{
    public static void main(String[] args) {
        int i=1;
        int count=0;
        int count2=0;
        int sum=0;
        int sum2=0;

        while (i<=15){
            if (i%3==0){
                count++;
                sum+=i;
            }
            if (i%2==0 && i<=10){
                count2++;
                sum2=sum2+i;
            }
           i++;

        }
        System.out.println(sum);
        System.out.println(sum2);

        System.out.println(sum-sum2);
    }}




class While5{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int i=1;
        int count=0;
        while(i<20) {
            if (a % i == 0) {
                count++;
            }
            i++;
        }
            if(count==2){
                System.out.println("prime");
            }
            else{
                System.out.println("not");

            }}}




class while6{
    public static void main(String[] args) {
        while (true){
            System.out.println(1);
        }
    }
}
class while7{
    public static void main(String[] args) {
        int i=0;
        while (i<1){
            System.out.println(1);
        }
    }
}


class Dowhile{
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=5);
    }}

class Dowhile1{
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i+=2;
        }
        while(i<=10);

    }
}

class Dowhile3{
    public static void main(String[] args) {
        int i=1;
        do{
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        while(i<=10);

    }
}

class Dowhile4{
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        do{
            sum+=i;
            i++;
        }
        while (i<=10);
        System.out.println(sum);
    }}


class Dowhilw6{
    public static void main(String[] args) {
        int sum=0;
        int num;
        do{
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number: ");
            num=scanner.nextInt();
            sum+=num;
        }
        while (num!=0);
        System.out.println(sum);
    }
}


class DoWhile7{
    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        int i=1;
        do{
            int j=i*3;
            if (j%2==0){
                sum+=1;
            }
            else{
                sum1+=1;
            }
            i++;
        }
        while (i<=10);
        System.out.println("Even number are "+sum);
        System.out.println("odd number are "+sum1);


    }
}


class While8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        int sum=0;
        while (num!=0){
            sum+=num;
            System.out.println(sum);
        }
        while (num==0){
            break;
        }
    }
}
