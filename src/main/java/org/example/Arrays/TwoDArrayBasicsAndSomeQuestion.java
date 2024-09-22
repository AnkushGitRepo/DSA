import java.util.Scanner;

class TwoDArrayBasicsAndSomeQuestion{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 2D Array Declaration In Latter Format
        System.out.println("2D Array Declaration In Latter Format And Print Function Test.");
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);

        // 2D Array Declaration In Former Format
//        int [][] arr2 = createTwo2DArray();
//        print(arr2);

         // Matrix Sum
        System.out.println("Matrix Sum");
        int [][] sumMatrix = matrixSum(arr, arr);
        print(sumMatrix);

        // Matrix Multiplication
        System.out.println("Matrix Multiplication");
        System.out.println("Matrix 1");
        int [][] arr1 = {{1,2,3},{4,5,6}};
        print(arr1);
        System.out.println("Matrix 2");
        int [][] arr3 = {{1,2},{3,4},{5,6}};
        print(arr3);
        int [][] multiplicationMatrix = multiplicationOfArray(arr1, 2, 3, arr3, 3, 2);
        System.out.println("Multiplication Matrix");
        print(multiplicationMatrix);

        // Reverse 2D Array
        System.out.println("2D Array for Reverse");
        int [][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr4);
        System.out.println("Reversed 2D Array");
        int [][] reverse2DArray = reverse2DArray(arr4);
        print(reverse2DArray);
    }


    // Print 2D Array Function
    public static void print(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Create two 2D arrays and return them.
    public static int[][] createTwo2DArray(){
        System.out.print("Enter the no of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the no of columns: ");
        int cols = scanner.nextInt();
        int [][] arr = new int[rows][cols];

        // Input 2D Array
        System.out.println("Enter the elements of 2D Array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        return arr;
    }


    // Matrix Sum
    public static int[][] matrixSum(int [][] arr1, int [][] arr2){
        if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){
            int [][] sumMartix = new int[arr1.length][arr1[0].length];
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[i].length; j++){
                    sumMartix[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return sumMartix;
        }
        else{
            System.out.println("Matrix Sum Not Possible: Dimension Mismatch");
        }
        return new int[0][0];
    }

    // Matrix Multiplication
    public static int[][] multiplicationOfArray(int [][] arr1, int r1, int c1, int [][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Matrix Multiplication Not Possible: Dimension Mismatch");
            return new int[0][0];
        }

        int[][] multiplicationMatrix = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    multiplicationMatrix[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return multiplicationMatrix;
    }

    // Reverse 2D Array
    public static int[][] reverse2DArray(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                reverse(arr[i],0,arr[i].length-1);
            }

        }
        return arr;
    }

    public static void swap(int [] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void reverse(int [] arr, int i, int j){
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}