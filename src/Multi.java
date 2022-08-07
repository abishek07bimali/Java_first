import java.util.Arrays;
import java.util.Scanner;

class MultiArray{
    public static void main(String[] args) {
        int row=2;
        int column=2;
        int [][] arr=new int [row][column];
        arr [0][0] =5;
        arr [0][1] =5;
        arr [1][0] =5;
        arr [1][1] =5;
        for (int i=0; i<row; i++){
            for (int j=0; i<column; j++){
                arr[i][j]=i+1;
        }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

class MultiArray1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of row:");
        int row=scanner.nextInt();
        System.out.println("enter the number of column:");
        int column=scanner.nextInt();
        int [][] arr=new int [row][column];
//        arr [0][0] =5;
//        arr [0][1] =5;
//        arr [1][0] =5;
//        arr [1][1] =5;
        for (int i=0; i<row; i++){
            for (int j=0; i<column; j++){
                System.out.println(arr[i][j] +" ");
            }
        }
        System.out.println();
    }
}



//     Write a java program to Add two 2x3 matrices.
class MatrixAdditionExample{
    public static void main(String args[]){
//creating two matrices
        int a[][]={{1,3,4},{2,4,3}};
        int b[][]={{1,3,4},{2,4,3}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));

//creating another matrix to store the sum of two matrices
        int c[][]=new int[2][3];  //2 rows and 3 columns

//adding and printing addition of 2 matrices
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }
    }}

//    Write a java program to multiply two 2x3 matrices.
class MatrixMultiplicationExample{
    public static void main(String args[]){
//creating two matrices
        int a[][]={{1,3,4},{2,4,3}};
        int b[][]={{1,3,4},{2,4,3}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));

//creating another matrix to store the sum of two matrices
        int c [][]=new int[2][3];  //2 rows and 3 columns

//adding and printing multiplication of 2 matrices
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();/*new line8*/
        }}}





