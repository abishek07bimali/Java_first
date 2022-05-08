import java.util.Scanner;

public class break_and_continue {
}

class B_and_C{
    public static void main(String[] args) {
        int i;
        for (i=1;i<=10;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }}}

class B_and_C1{
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            if(i%2==0){
                i++;
                continue;
            }
                System.out.println(i);
            i++;
        }
    }
}

class B_and_C2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int A= scanner.nextInt();
        int result;
        if (A%2==0){
            result=1;
        }
        else{
            result =2;
        }
        switch (result){
            case 1:
                System.out.println("even");
                break;
            case 2:
                System.out.println("odd");
                break;
        }
    }}


class B_and_C3 {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int AAA=scanner.nextInt();
        String  primeNumbers = "";
        for (int i = 1; i <=AAA; i++) {
            int counter=0;
//            for(int num =i; num>=1; num--) {
                if(i%AAA==0) {
                    break;

                }
               else
            {
                primeNumbers = primeNumbers + i + " ";
            }}
        System.out.println("composite numbers from 1 to "+ AAA +" are :"+primeNumbers);

    }
    }

//
//
//
//