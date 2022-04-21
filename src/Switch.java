import java.util.Scanner;
//
class Qu1 {
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
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        double percentage10 = percentage / 10;
        int intPer = (int) percentage10;

        switch (intPer) {
            case 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            case 4 -> System.out.println("Grade: E");
            default -> System.out.println("Grade: F");
        }
    }
}
//class Qu1{
//    public static void main(String[] args) {
//        Scanner z=new Scanner(System.in);
//        System.out.println("Input Integer");
//        int a=z.nextInt();
//        System.out.println("Input Integer");
//        int b=z.nextInt();
//        switch(a>b){
//            case 0:
//                System.out.println("maximum number " + b);
//                break;
//            case(a>b):
//                System.out.println("maximum number " + a);
//                break;
//            default:
//                System.out.println("Both are equal");
//        }
//
//    }
//}

//JAVA Program to find the maximum between three numbers. Using the switch statement.

class Qu2{
    public static void main(String[] args)
        {

        }
}
//
//class Qu3{
//    public static void main(String[] args) {
//        Scanner z=new Scanner(System.in);
//        System.out.println("Input Integer");
//        int A=z.nextInt();
//        switch (A){
//            case (A%5==0) && (A%11==0):
//
//                System.out.println("");
//        }
//        }
//
//}



class Qu5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();

        switch (year%4) {
            case 0 : switch (year%100) {
                case 0 :
                    switch (year % 400) {
                        case 0 -> System.out.println("Leap Year");
                        default -> System.out.println("Normal Year");
                    }
                    break;
                default:
                    System.out.println("Leap Year");
                    break;
            }break;
            default:
                System.out.println("Normal Year");
                break;
        }
    }
}

class Qu6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = input.next().charAt(0);
        switch (char1) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is not an alphabet.");
        }
    }
}

class Qu7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = input.next().charAt(0);
        switch (char1) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("The alphabet is a vowel.");
            default -> System.out.println("The alphabet is a consonant.");
        }
    }
}

class Qu8{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= input.next().charAt(0);
        switch (char1) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("The character is a digit.");
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is a special character");
        }
    }
}

//JAVA Program to take the value from the user as input the month number and print number of
//days in that month. Using switch statement
class Qu11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int day=scanner.nextInt();
        switch(day) {
            case 0:
                System.out.println("Baisakh has 30 days");
                break;
            case 1:
                System.out.println("jestha has 30 days");
                break;
            case 2:
                System.out.println("Aasar has 30 days");
                break;
            case 3:
                System.out.println("Shrawan has 30 days");
                break;
            case 4:
                System.out.println("Bhadra has 30 days");
                break;
            case 5:
                System.out.println("Ashwoj has 30 days");
                break;
            case 6:
                System.out.println("Kartik has 30 days");
                break;
            case 7:
                System.out.println("mangsir has 30 days");
                break;
            case 8:
                System.out.println("paush has 30 days");
                break;
            case 9:
                System.out.println("magh has 30 days");
                break;
            case 10:
                System.out.println("falgun has 30 days");
                break;
            case 11:
                System.out.println("chitra has 30 days");
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}


//0. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.

class Qu10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day = scanner.nextInt();
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}

class Qu17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1 = input.nextInt();
        System.out.print("Enter the angle ");
        a2 = input.nextInt();
        System.out.print("Enter the angle ");
        a3 = input.nextInt();
        sum=a1+a2+a3;
        switch (sum) {
            case 180 -> System.out.println("The triangle is valid.");
            default -> System.out.println("The triangle is not valid.");
        }
    }
}

class Qu18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;
        int salaryInt = (salary-1)/10000;

        switch (salaryInt) {
            case 0:
                hra = 0.2*salary;
                da = 0.8*salary;
            case 1:
                hra = 0.25*salary;
                da = 0.9*salary;
            default:
                hra = 0.3*salary;
                da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}

class Qu19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        int unitsInt = units/50;
        switch (unitsInt) {
            case 0 -> price=units*0.5;
            case 1,2 -> price=25+(units-50)*0.75;
            case 3,4 -> price=25+75+(units-150)*1.2;
            default -> price=25+75+180+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}

class Qu21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        hours = hours%24;
        System.out.println("Enter minutes: ");
        input.nextInt();

        switch (hours) {
            case 0,1,2,3,4,5,6,7,8,9,10,11 -> System.out.println("AM");
            case 13,14,15,16,17,18,19,20,21,22,23 -> System.out.println("PM");
        }
    }
}

class Qu23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(-num);
    }
}

class Qu24 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int num,x;
        System.out.print("Enter the number ");
        num= demo.nextInt();
        x= num%2;
        switch (x) {
            case 0 -> num += 1;
            default -> {
            }
        }
        System.out.println(num);
    }
}
