import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> myArray =new ArrayList <Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        System.out.println(myArray);
        myArray.add(5);
        System.out.println(myArray);
        myArray.add(3,6);
        System.out.println(myArray);
        myArray.set(0,2);
        myArray.set(5,0);
        myArray.set(3,7);
        System.out.println(myArray);
        myArray.remove(2);
        System.out.println(myArray);
            }
}

class AssarzListString{
    public static void main(String[] args) {
        ArrayList<String> myArray =new ArrayList <String>();
        myArray.add("Abishek");
        myArray.add("Shrijan");
        myArray.add("Bikesh");
        System.out.println(myArray);
        myArray.add("Ram");
        myArray.add("Shyam");
        myArray.add("Mukesh");
        System.out.println(myArray);
        for(int i=0;i<myArray.size();i++){
            String get=myArray.get(i);
            System.out.println(get);
        }
        myArray.remove("Ram");
        myArray.remove(1);
        System.out.println(myArray);
    }
}

class ArraylistInteger {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>(10);
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("Enter the number: ");
            int add =scanner.nextInt();
                    myArray.add(add);
        }
        System.out.println(myArray);
        ArrayList<Integer> myArray1 = (ArrayList<Integer>)myArray.clone();
        System.out.println(myArray1);
//        primeArray(myArray);
        System.out.println(primeArray(myArray));
    }
    public static int primeArray(ArrayList<Integer> myArray) {
        int sum=0;
        for(int j=0;j< myArray.size();j++){
            int count=0;
            int value=myArray.get(j);
            for (int i=1; i<value;i++){
                if((value % i) == 0){
                count++;
            }}
            if (count==2){
                sum++;}
        }
    return sum;
    }}


class A10Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i=0; i<=2; i++) {
            System.out.print("Enter the name: ");
            String carName = input.next();
            arrayList.add(carName);
        }
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}

class A10Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        for (int i=1; i<=10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            arrayList.add(num);
        }
        System.out.println("Sum of prime: "+sumPrime(arrayList));
    }

    public static int sumPrime(ArrayList<Integer> a) {
        int sum=0;
        for (int i=0; i<10; i++){
            int factors=0;
            for (int j = 2; j<a.get(i); j++){
                if (a.get(i)%j==0) {
                    factors++;
                    break;
                }
            }
            if (factors==0) {
                sum+=a.get(i);
            }
        }
        return sum;
    }
}


class A10Question3 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        ArrayList<Integer> array= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            System.out.print("Enter the number ");
            int num= demo.nextInt();
            array.add(num);
        }
        System.out.println("Original Array: "+array);
        ascendingSort(array);
        descendingSort(array);
    }
    public static void ascendingSort(ArrayList<Integer> array){
        int a,b,len= array.size();
        for (int i=0;i< len;i++){
            for (int j=0;j< len-i-1;j++){
                a= array.get(j);
                b= array.get(j+1);
                if (a>b){
                    array.set(j,b);
                    array.set(j+1,a);
                }
            }
        }
        System.out.println("Ascending Order: "+array);
    }
    public static void descendingSort(ArrayList<Integer> array){
        int a,b,len= array.size();
        for (int i=0;i< len;i++){
            for (int j=0;j< len-i-1;j++){
                a= array.get(j);
                b= array.get(j+1);
                if (a<b){
                    array.set(j,b);
                    array.set(j+1,a);
                }
            }
        }
        System.out.println("Descending Order: "+array);
    }
}

//WAp to create a function with declaration as static int createArray(int rows,int columns) to create a two dimensional array.

class Two_dimensional{
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createArray(2,3)));
    }
    public static int[][] createArray(int row,int column){
        int [][] arr=new int [row][column];
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("enter the number: ");
                arr[i][j]=scanner.nextInt();
    }
}
        return arr;
    }
}
