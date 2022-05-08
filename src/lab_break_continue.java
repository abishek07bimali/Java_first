import java.util.Scanner;

public class lab_break_continue {
}

//Write a program to print numbers from 1 to 10.
class Lab1{
    public static void main(String[] args) {
        int i;
        for (i=1;i<=20;i+=1){
            if (i>10){
                continue;
            }
            System.out.println(i);
        }
    }
}

//WAP to display even number between 10 and 30.
class Lab2{
    public static void main(String[] args) {
        int i;
        for (i=1;i<=30;i++){
            if (i<10){
                i++;
                continue;
            }
            if (i%2==0) {
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
//
//WAP to display the number of even numbers between 10 and 30.
class Lab3{
    public static void main(String[] args) {
        int i;
        int count=0;
        for (i=1;i<=30;i++){
            if (i<10){
                i++;
                continue;
            }
            if (i%2==0) {
                count++;
            }
            else{
                continue;
    }
}
        System.out.println(count);

    }}

//WAP to display no. of even and no. of odd number between 10 and 30.
class Lab4{
    public static void main(String[] args) {
        int i;
        int count=0;
        for (i=1;i<=30;i++){
            if (i<10){
                i++;
                continue;
            }
            if (i%2!=0) {
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
    }
}

//WAP to display multiplication table of a given no.
class Lab5{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int A=scanner.nextInt();
        int i=1;
        for (i=1;i<=20;i++){
            if (i>=11){
                continue;
            }
            int j=i*A;
            System.out.println(A+" X "+i+" = "+j);
        }
    }
}



//Write a program to calculate the sum of first 10 natural number.
class Lab6{
    public static void main(String[] args) {
        int i;
        int sum=0;
        for (i=1;i<20;i++){
            if (i>=11){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}


//Write a program that prompts the user to input a positive integer. It should then
//print the multiplication table of that number.
class Lab7{
    public static void main(String[] args) {
            {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter number:");
                int n=s.nextInt();
               int num= Math.abs(n);
                for(int i=1; i <=20; i++)
                {
                    if (i>=11){
                        continue;
                }
                    System.out.println(num+" * "+i+" = "+num*i);

                }
        }
}}

//Write a program to find the factorial value of any number entered through the
//keyboard.
class Lab8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another. (Do not use Java built-in method)
class Lab9{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        System.out.println("Enter the second number: ");

        int num2 = scanner.nextInt();

        int power = 1;
            for (int i = 1; i <= num2; i++) {
                power = power * num;
            }
            System.out.println(power);

}}
//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321.
class Lab10{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        int i;
        int digit;
        int rev=0;
        for (i=num;i>0;i=i/10) {
            digit = i % 10;
            rev = rev* 10 + digit;
    }
        System.out.println(rev);
    }
}


//Write a program that reads a set of integers, and then prints the sum of the even
//and odd integers.
class Lab11{
    public static void main(String[] args) {
        int i;
        int sum_even=0;
        int sum_odd=0;
        for (i=1;i<=20;i++){
            if (i%2==0){
                sum_even+=i;
            }
            else{
                sum_odd+=i;
            }
        }
        System.out.println(sum_even);
        System.out.println(sum_odd);
    }
}

//Write a program that prompts the user to input a positive integer. It should then
//output a message indicating whether the number is a prime number.
class Lab12{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scanner.nextInt();
        int count=0;
        for(int i =1; i<=30;i++){
            if(num%i==0){
                count+=1;
            }
            else{
                continue;
            }
        }
        if(count==2){
            System.out.println(num+" is prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
    }
}

//Write a program to calculate HCF of Two given number.
class Lab13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        int  hcf = 0;
        for(int i = 1; i <= num1 || i <= num2; i++) {
            if( num1%i == 0 && num2%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of "+num1+ " and "+ num2 +"  is :"+hcf);
    }
}


//Write a do-while loop that asks the user to enter two numbers. The numbers
//should be added and the sum displayed. The loop should ask the user whether he
//or she wishes to perform the operation again. If so, the loop should repeat;
//otherwise it should terminate.
class Lab14{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ask;
    do {
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();

        int sum=num1+num2;
        System.out.println(sum);

        System.out.print("Continue?(y/n): ");
        ask = scanner.next().charAt(0);
        }

        while (ask=='y');
    }
}

//Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered.
class Lab15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the numbers till you wants : ");
        int num1 = scanner.nextInt();
        int count=0;
        int count1=0;
        int count2=0;
        for (int i=1; i<=num1;i++){
            System.out.println("Enter the number : ");
            int num=scanner.nextInt();
            if(num>0){
                count+=1;
            }
            else if(num==0){
                count1+=1;
            }
            else {
                count2+=1;
            }

        }
        System.out.println("number of positive number are :"+ count);
        System.out.println("number of negative number are :"+ count2);
        System.out.println("number of zero  are :"+ count1);
    }
}

//Write a program to enter the numbers till the user wants and at the end the
//program should display the largest and smallest numbers entered.
class Lab16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        int num,greatest=0,least=0,j=0;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num>greatest) {
                greatest=num;
            } else if (least==0&&num!=0) {
                least = num;
                j=1;
            } else if (num<least&&j>0) {
                least = num;
            } else {
                assert true;
            }
            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
        System.out.println("Greatest: "+greatest);
        System.out.println("Least: "+least);
}}

//Write a program to print out all Armstrong numbers between 1 and 500. If sum of
//cubes of each digit of the number is equal to the number itself, then the number is
//called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
class Lab17{
    public static void main(String[] args) {
        int digit;
        for (int i=1;i<=500;i++){
            int cube=0;
            for (int j=i;j>0;j/=10) {
                digit=j%10;
                cube+=digit*digit*digit;
            }
            if (cube==i) {
                System.out.println(i);

            }
        }
    }
}

//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....
class Lab18{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the term of fibonacci series term: ");
        int n = scanner.nextInt(), first = 0, second = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }

}


//Write a program to calculate the sum of following series where n is input by user.
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
class lab19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the numbers : ");
        int num = scanner.nextInt();
        double sum=0;
        for (int i=1;i<=num;i++){
            sum=1.0/i;
        }
        System.out.println(sum);
    }
}

//Compute the natural logarithm of 2, by adding up to n terms in the series
//1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
//where n is a positive integer and input by user.
class Lab20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the numbers : ");
        int num = scanner.nextInt();
        double sum=0;
        for (int i=1;i<=num;i++){
            if(i%2==0){
                sum=sum-1.0/i;
            }
            else{
                continue;
            }
        }
        System.out.println(sum);
    }
}