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
        else if (character>0 && character<0 && character==0){
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
            }
        }
}

//12. Write a JAVA program to input month number and print number of days in that month.
class Que12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day=scanner.nextInt();
        if (day==1){
            System.out.println("Baisakh has 30 days");
        }
        else if (day==2){
            System.out.println("jestha has 30 days");
        }
        else if (day==3){
            System.out.println("Aasar has 30 days");
        }
        else if (day==4){
            System.out.println("Shrawan has 30 days");
        }
        else if (day==5){
            System.out.println("Bhadra has 30 days");
        }
        else if (day==6){
            System.out.println("Ashwoj has 30 days");
        }
        else if (day==7){
            System.out.println("Kartik has 30 days");
        }
        else if (day==8){
            System.out.println("Mangsir has 30 days");
        }
        else if (day==9){
            System.out.println("Poush has 30 days");
        }
        else if (day==10){
            System.out.println("Magh has 30 days");
        } else if (day==11){
            System.out.println("Falgun has 30 days");
        } else if (day==12){
            System.out.println("Chaitra has 30 days");
        }
        else{
            System.out.println("default");
        }
    }
}

//13. Write a JAVA program to count total number of notes in given amount.
class Que13{

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

