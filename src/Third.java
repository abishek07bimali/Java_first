import javax.swing.*;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Third {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int A=scanner.nextInt();
//        System.out.println("Enter the number");
//        int B=scanner.nextInt();
        scanner.nextLine();
        int sum =A;
        JOptionPane.showMessageDialog(null,"the sum is: "+sum);
//        System.exit(0);
    }
}
class Gui{
    public static void main(String[] args) {
        String name="Abishek Bimali";
        JOptionPane.showMessageDialog(null,name);
    }
}

class gui{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your name: " )));
        String third=((JOptionPane.showInputDialog("enter your Address: " )));

        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter your Phone: " )));
        JOptionPane.showMessageDialog(null,"My name is "+first+"\n My address is "
                +third+"\n my phone number is "+Second);
    }
}
class marks{
    public static void main(String[] args) {
        double A=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of maths: ")));
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
         double sum=A+B+C+D;
         double per= sum/4;
         int percentint=(int)per;
//         JOptionPane.showMessageDialog(null,"Your percent is: "+ percentint+"%" );
         JOptionPane.showMessageDialog(null,"Your percent is: "+ percentint +"/U0025");
           }
    }




//    questions for day 3
class q1{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your name: " )));
        String third=((JOptionPane.showInputDialog("enter your Address: " )));
        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter your Phone: " )));
        int Fourth=Integer.parseInt((JOptionPane.showInputDialog("enter your marks scored: " )));

        JOptionPane.showMessageDialog(null,"My name is "+first+"\n My address is "
                +third+"\n my phone number is "+Second+"\n"+first+" has scored "+Fourth+" marks.");
    }
}

class q2{
    public static void main(String[] args) {
        int First=Integer.parseInt((JOptionPane.showInputDialog("enter the first number: " )));
        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter the second number: " )));
        int Third=Integer.parseInt((JOptionPane.showInputDialog("enter the third number: " )));
        int Fourth=Integer.parseInt((JOptionPane.showInputDialog("enter your fouth number: " )));

        int sum=First+Second+Third+Fourth;
        JOptionPane.showMessageDialog(null,"The sum of given inputs is "+sum);
    }
}
class q3{
    public static void main(String[] args) {
        String name=((JOptionPane.showInputDialog("enter your name: " )));
        double A=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of maths: ")));
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=A+B+C+D;
        double per= sum/4;
        int percentint=(int)per;
        if (percentint>=70) {
            JOptionPane.showMessageDialog(null ,name+" has Scored "+" First division");
        }
        else if(percentint>=50){
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Second division");
        }
        else if (percentint>=40){
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Third division");
        }
        else {
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Fail");
        }
    }
}



class q4{
    public static void main(String[] args) {

        int First = Integer.parseInt((JOptionPane.showInputDialog("enter the first number: ")));
        int Second = Integer.parseInt((JOptionPane.showInputDialog("enter the second number: ")));
        int sum = First + Second;
        int Pro = First * Second;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
        JOptionPane.showMessageDialog(null,"The product is: "+Pro);
    }
}
class q5{
    public static void main(String[] args) {
        int First = Integer.parseInt((JOptionPane.showInputDialog("enter the first number: ")));
        int Second = Integer.parseInt((JOptionPane.showInputDialog("enter the second number: ")));
        int sum = First + Second;
        int Pro = First * Second;
        float div= sum/Pro;
        JOptionPane.showMessageDialog(null,"The division is: "+div);
    }
}
class q6{
    public static void main(String[] args) {
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double Area=B*C;
        int AA=(int)Area;
        JOptionPane.showMessageDialog(null,"The area is: "+AA);

    }
}
class q7{
    public static void main(String[] args) {
        String A=((JOptionPane.showInputDialog("enter your name: " )));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the roll number: ")));
        String C=((JOptionPane.showInputDialog("enter field of intrest: " )));
        JOptionPane.showMessageDialog(null,"My name is "+A+ " and my roll number is "+B+" " +
                "and my field of interest is "+C+".");

    }
}
class q8{
    public static void main(String[] args) {
        float A= Float.parseFloat(JOptionPane.showInputDialog("enter the length of square: "));
        float Area=A*A;
        float perimeter=4*A;
        JOptionPane.showMessageDialog(null,"The area of square is "+Area +" and the perimeter is "+perimeter);
    }
}

class q9{
    public static void main(String[] args) {
        double A=Double.parseDouble(JOptionPane.showInputDialog("Enter the number: "));
        double Square =A*A;
        JOptionPane.showMessageDialog(null,"The square of "+A+" is "+Square);
    }
}

class q10{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your First Name: " )));
        String Second=((JOptionPane.showInputDialog("enter your Second Name: " )));
        JOptionPane.showMessageDialog(null,first+" "+Second);

    }
}
class q11{
    public static void main(String[] args) {
        int A = Integer.parseInt((JOptionPane.showInputDialog("enter the First number: ")));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the Second number: ")));
        int C = Integer.parseInt((JOptionPane.showInputDialog("enter the Third number: ")));
        String check=((A==B)&&(A==C)) ?"All three are equal": (A==B)?"A and B are equal":(A==C)?"A and C are Equal":(B==C)?"B ans C are equal":"nothing is same";

        JOptionPane.showMessageDialog(null,check);
    }
}

class q12{
    public static void main(String[] args) {
        int A = Integer.parseInt((JOptionPane.showInputDialog("enter the First number: ")));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the Second number: ")));
        boolean AA=(A<B)&& (A<50);
        JOptionPane.showMessageDialog(null,AA);
    }
}

class q13{
    public static void main(String[] args) {
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=B+C+D;
        double per= sum/4;
        int percentint=(int)per;
        JOptionPane.showMessageDialog(null,"Robert has scored: "+ percentint +"%");
    }
}