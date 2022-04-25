import java.util.Scanner;



//1. Write a JAVA program to find maximum between two numbers.
public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        System.out.println("enter the digit: ");
        int B=scanner.nextInt();

        if (A>=B){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}

//2. Write a JAVA program to find maximum between three numbers.
class Que2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        System.out.println("enter the digit: ");
        int B=scanner.nextInt();
        System.out.println("enter the digit: ");
        int C=scanner.nextInt();
        if (A>B && B>C){
            System.out.println("A is greater.");
        }
        else if (B>A && A>B){
            System.out.println("B is greater. ");
        }
        else{
            System.out.println("c is greater.");
        }

    }
}

//3. Write a JAVA program to check whether a number is negative, positive or zero.
class Que3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        if (A<0){
            System.out.println("Number is negative");
        }
        else if(A==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class Que4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A=scanner.nextInt();
        if ((A%5==0)&& (A%11==0)){
            System.out.println("The given number is divisible by both 5 and 11.");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11.");
        }
    }
}

//5. Write a JAVA program to check whether a number is even or odd.
class Que5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int A = scanner.nextInt();
        if (A % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class Que6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }
}

//7. Write a JAVA program to check whether a character is alphabet or not.
class Que7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.next().charAt(0);

        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
        }else{
            System.out.print(character + " is not an alphabet.");
        }

    }
}
//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class Que8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.next().charAt(0);

        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            if((character>='a' ||character<='A'||character>='E' && character<='e'
                    ||character>='I' ||character<='i'||character>='O' && character<='o'
                    ||character>='U' && character<='u')){
                System.out.println(character+" is a vowel alphabet.");
            }
            else{
                System.out.println(character+" is a consonant alphabet.");
            }
        }
        else{
            System.out.print(character + " is not an alphabet.");
        }
        }
}

//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
class Que9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.nextLine().charAt(0);

        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
        }
        else if (character>0 || character<0 ||character==0){
            System.out.print(character + " is an digit.");
        }
        else{
            System.out.print(character + " is a special character.");
        }}}


//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class Que10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char character = scanner.nextLine().charAt(0);

        if((character>='A' && character<='Z')){
            System.out.print(character + " is an upper case alphabet.");
        }
        else if(character>='a' && character<='z'){
            System.out.print(character + " is an lower case alphabet.");
        }
        else{
            System.out.print(character + " is not an alphabet.");
        }
    }
}

class Que11{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int day=scanner.nextInt();
            if (day==1){
                System.out.println("sunday");
            }
            else if (day==2){
                System.out.println("monday");
            }
            else if (day==3){
                System.out.println("tuesday");
            }
            else if (day==4){
                System.out.println("wednesday");
            }
            else if (day==5){
                System.out.println("Thursday");
            }
            else if (day==6){
                System.out.println("friday");
            }
            else if (day==7){
                System.out.println("saturday");
            }
            else{
                System.out.println("default");
            }}}

//12. Write a JAVA program to input month number and print number of days in that month.
class Que12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the months: ");
        int day=scanner.nextInt();
        System.out.println("enter the year: ");
        int year=scanner.nextInt();

        if (day==1){
            System.out.println("January has 31 days");
        }
        else if (day==2){
            if ((year%4==0&&year%100!=0)||year%400==0) {
                System.out.println("Feb has 29 days");
            }
            else {
            System.out.println("Feb has 28 days");
        }}
        else if (day==3){
            System.out.println("March has 31 days");
        }
        else if (day==4){
            System.out.println("April has 30 days");
        }
        else if (day==5){
            System.out.println("May has 31 days");
        }
        else if (day==6){
            System.out.println("June has 30 days");
        }
        else if (day==7){
            System.out.println("July has 31 days");
        }
        else if (day==8){
            System.out.println("August has 31 days");
        }
        else if (day==9){
            System.out.println("September has 30 days");
        }
        else if (day==10){
            System.out.println("October has 31 days");
        } else if (day==11){
            System.out.println("November has 30 days");
        } else if (day==12){
            System.out.println("December has 31 days");
        }
        else{
            System.out.println("default");
        }
    }
}

//13. Write a JAVA program to count total number of notes in given amount.
class Que13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total amount: ");
        int A=scanner.nextInt();
//        int B=5;
        System.out.println("enter the amount: ");
        float B=scanner.nextFloat();
         if (A%B==0){
             float total=A/B;
             System.out.println(total);
         }
         else{
             System.out.println("invalid");
         }

    }

}

//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class Que14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the angle: ");
        int angel1 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle2 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle3 = scanner.nextInt();
        int sum=angel1+angle3+angle2;
        if (sum==180) {
            System.out.println("Triangle is valid.");
        }
        else{
            System.out.println("triangle is invalid");
    }}}

class Que15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int side1 = input.nextInt();
        System.out.println("Enter second side of triangle: ");
        int side2 = input.nextInt();
        System.out.println("Enter third side of triangle: ");
        int side3 = input.nextInt();

        if (side1+side2>=side3 && side1-side2<=side3) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}


//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class Que16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side: ");
        int side1 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side2 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side3 = scanner.nextInt();
        if ((side1 == side2) && (side3 == side2)) {
            System.out.println("Triangle is equilateral.");
        }
        else if ((side1 == side2) || (side3 == side2)) {
            System.out.println("Triangle is isosceles.");
        }
        else{
            System.out.println("Triangle is scalene.");
        }
    }
}

class Que17{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the a");
        float a=scanner.nextFloat();
        System.out.println("Enter the b");
        float b= scanner.nextFloat();
        System.out.println("Enter the c");
        float c= scanner.nextFloat();
        double determinant=(b*b)-(4*a*c);
        double sqrt=Math.sqrt(determinant);
        System.out.println(determinant);


        double firstRoot=(-b + sqrt)/(2*a);
        double secondRoot=(-b + sqrt)/(2*a);
        if (determinant>0){
            System.out.println("first root : "+firstRoot+" and "+secondRoot);
        }
        else if(determinant==0);
        System.out.println(firstRoot);
    }
}

//18. Write a JAVA program to calculate profit or loss.
class Que18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Cost price: ");
        int cp = scanner.nextInt();
        System.out.println("enter the selling price: ");
        int sp = scanner.nextInt();
        if (sp > cp) {
            System.out.println("you had profit.");
        }
     else{
            System.out.println("You had loss.");
        }
    }
}

class Que19{
    public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        String validity;
        validity = (percentage>100||percentage<0) ? "\nInvalid Marks!" : "";
        if (validity.equals("")) {
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");}
            else {
                System.out.println("Grade: F");
            }
        }else {
            System.out.println(validity);
        }
    }
}
/*Write a JAVA program to input basic salary of an employee and calculate its Gross salary
according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
class Que20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;

        if (salary<10000) {
            hra = 0.2*salary;
            da = 0.8*salary;
        } else if (salary<=20000) {
            hra = 0.25*salary;
            da = 0.9*salary;
        } else {
            hra = 0.3*salary;
            da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}




/*Write a JAVA program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill */


class Que21{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        if (units<=50) {
            price=units*0.5;
        } else if (units<=150) {
            price=25+(units-50)*0.75;
        } else if (units<=250) {
            price=25+75+(units-150)*1.2;
        } else {
            price=25+75+120+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}

