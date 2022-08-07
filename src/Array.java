import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] A=new int[5];
        for (int i=0; i<A.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number: ");
            int input=scanner.nextInt();
            A[i]=input;
        }
        System.out.println(Arrays.toString(A));
    }
}

class FirstArrays{
    public static void main(String[] args) {
        int [] A=new int[]{1,2,3,4,5,6,7,8,9,10,};
//        System.out.println(A.length);
//        System.out.println(java.util.Arrays.toString(A));
        int sum=0;
        for (int i=0;i<A.length;i++){
            if(A[i]%2!=0) {
                sum += A[i];
            }
//            System.out.println(A[i]);
        }
        System.out.println(sum);
    }}


class Array1 {
    public static void main(String[] args) {
        int [] A=new int[10];
        for (int i=0; i<A.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number: ");
            int input=scanner.nextInt();
            A[i]=input;
        }
        int sum=0;
        for (int j=0;j<A.length;j++) {
            if (A[j] % 2 != 0) {
                sum += A[j];
            }
            System.out.println(sum);
        }}}





class Fumarray{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
//        createArray();
//        System.out.println(createArray());
    }
    public static int[] createArray(){
        int [] A=new int[5];
        for (int i=0; i<A.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number: ");
            int input=scanner.nextInt();
            A[i]=input;

    }
            return A;
    }
}


//to print multiples of three Present in A SUER DEFINED ARRAYS OF SIZE 10;
//
class Array_mul{
    public static void main(String[] args) {
        mulThree();
    }
    public static void mulThree(){
        int [] A=new int[10];
        for (int i=0; i<A.length;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int input = scanner.nextInt();
            A[i] = input;
        }
        for (int i=0; i<A.length;i++){
            if (A[i]%3==0){
                System.out.print(A[i]+" ");
            }
        }
    }}


    class Funarray{
        public static void main(String[] args) {
//        System.out.println(Arrays.toString(createArray()));
            createArray();
//        System.out.println(createArray());
        }
        public static int[] createArray(){
            int [] A=new int[5];
            for (int i=0; i<A.length;i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the number: ");
                int input = scanner.nextInt();
                A[i] = input;

            }
            for (int i=0; i<A.length;i++) {
                if (A[i]%2== 0) {
                    continue;            }
                else{
                    System.out.print(A[i]+" ");
                }
            }
            return A;
        }
    }


class Funarray1{
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(createArray()));
        createArray();
    }

    public static void createArray(){
        int [] A=new int[5];
        for (int i=0; i<A.length;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int input = scanner.nextInt();
//            A[i] = input;
            if (i%2==0){
                continue;
            }
            else{
                A[i]=input;
            }
        }
    }
}



class ArrayEven{
    public static void main(String[] args) {
        createArray();
    }
    public static void createArray(){
        int [] A=new int[10];
        int countEven=0;
        int countOdd=0;
        int i;
        for (i=0; i<A.length;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int input = scanner.nextInt();
            A[i] = input;

        if (A[i]%2==0){
            countEven++;
        }
        else{
            countOdd++;
        }}

        System.out.println(countEven);
        System.out.println(countOdd);

    }

}


class ArrayEvenParameter{
    public static void main(String[] args) {
        int [] A=new int[10];
        int i;
        for (i=0; i<A.length;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int input = scanner.nextInt();
            A[i] = input;}
        System.out.println(A);

        createArray(A);
    }
    public static void createArray(int[]A){
        int countEven=0;
        int countOdd=0;

        for (int i=0; i<A.length;i++) {
            if (A[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }}

        System.out.println(countEven);
        System.out.println(countOdd);
    }}



class Average{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of element in array: ");
        int num=scanner.nextInt();
        int [] A=new int[num];
        float sum=0;
        for (int i=0; i<A.length;i++){
            System.out.println("enter the number: ");
            int input=scanner.nextInt();
            A[i]=input;
            sum+=A[i];
        }
        float sum1=sum/num;
        System.out.println(Arrays.toString(A));
        System.out.println(sum1);
    }
}

class ArrayFun{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of element in array: ");
        int num=scanner.nextInt();
        int [] A=new int[num];
        int i;
        for (i=0; i<A.length;i++) {
            System.out.println("enter the number: ");
            int input = scanner.nextInt();
            A[i] = input;}
//        System.out.println(A);
        checkElement(A,num);
    }
    public static void checkElement(int[] A,int num){
        int sum=0;
        for (int i=0; i<A.length;i++) {
            sum+=A[i];
        }
        float sum1=sum/num;
        System.out.println(Arrays.toString(A));
        System.out.println(sum1);
        }
}


class ArrayMinMax{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of element in array: ");
        int num=scanner.nextInt();
        int [] A=new int[num];
        int i;
        for (i=0; i<A.length;i++) {
            System.out.println("enter the number: ");
            int input = scanner.nextInt();
            A[i] = input;}
            Arrays.sort(A);
        System.out.println(checkElementMax(A,num));
        System.out.println(checkElementMin(A));
    }
    public static int checkElementMax(int[] A, int num){
        return A[num-1];
    }
    public static int checkElementMin(int[] A) {
        return A[0];
    }
}


class ArraySum {
    public static void main(String[] args) {
        int [] A=new int[5];
        int sum=0;
        for (int i=0; i<A.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number: ");
            int input=scanner.nextInt();
            A[i]=input;
//            sum+=A[i];
            }
        for(int j=0;j<A.length;j++){
            if (A[j]%2==0){
                sum+=1;
            }
            }

        System.out.println(sum);
        System.out.println(Arrays.toString(A));
    }}

