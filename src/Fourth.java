import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Fourth {
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


class voterid{
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


//
class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day=scanner.nextInt();
        switch (day%2){
            case(0):
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
                break;
        }

    }}