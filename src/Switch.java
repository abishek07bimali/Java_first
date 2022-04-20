import java.util.Scanner;
//
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

class Qu10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day=scanner.nextInt();
        switch(day) {
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
