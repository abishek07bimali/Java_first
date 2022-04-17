import java.util.Scanner;


//Question 1
public class Second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Name of student: ");
        String A=scanner.nextLine();
        System.out.println("enter the marks of student: ");
        int B=scanner.nextInt();
        if (B>=70) {
            System.out.println(A+" has Scored "+" First division");
        }
        else if(B>=50){
            System.out.println(A+" has Scored "+"Second division");
        }
        else if (B>=40){
            System.out.println(A+" has Scored "+"Third division");
        }
        else {
            System.out.println(A+" has Scored "+"Fail");
        }
    }
}

class Question2{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int B=scanner.nextInt();
        System.out.println("Enter the Third number: ");
        int C=scanner.nextInt();
        System.out.println("Enter the Fourth number: ");
        int D=scanner.nextInt();

        int Sum=A+B+C+D;
        System.out.println("The sun is "+Sum);

    }
}

class question3{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Marks of Maths: ");
        double A=scanner.nextDouble();
        System.out.println("Enter the Marks of English: ");
        double B=scanner.nextDouble();
        System.out.println("Enter the Marks of Nepali: ");
        double C=scanner.nextDouble();
        System.out.println("Enter the Marks of Science: ");
        double D=scanner.nextDouble();
        double sum = A+B+C+D;
        System.out.println("The total marks is "+ sum);
        double percent=sum/4;
        String result;
        result=(percent>70)? "First class": (percent>59)? "Upper Second class" :(percent>49)?
                "Second class":(percent>39)?"third class" :"fail";
        System.out.println(result);


    }
}

class question4{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A=scanner.nextInt();
        System.out.println("Enter the second number: ");
        int B=scanner.nextInt();
        int sum =A+B;
        int product=A*B;
        System.out.println("The sum of given number is "+ sum);
        System.out.println("The product of given number is "+ product);
    }
}

class question5{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A=scanner.nextInt();
        System.out.println("Enter the second number: ");
        int B=scanner.nextInt();
        float sum =A+B;
        float product=A*B;
//        float SUM=Integer.parseInt(sum);
        float Division=product/sum;
        System.out.println("The Answer is "+ Division);

    }
}

class question6{

}