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

        // Transpose Of Matrix
        System.out.println("Transpose Of Matrix Test 1");
        int [][] arr5 = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr5);
        int [][] transposeMatrix = transposeOfMatrix(arr5);
        print(transposeMatrix);

        System.out.println("Transpose Of Matrix Test 2");
        int [][] arr6 = {{1,2},{3,4},{5,6}};
        print(arr6);
        int [][] transposeMatrix2 = transposeOfMatrix(arr6);
        print(transposeMatrix2);

        // Transpose Of Matrix In Place
        System.out.println("Transpose Of Matrix In Place Test 1");
        int [][] arr7 = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr7);
        transposeOfMatrixInPlace(arr7);
        print(arr7);

        System.out.println("Transpose Of Matrix In Place Test 2");
        int [][] arr8 = {{1,2},{3,4},{5,6}};
        print(arr8);
        transposeOfMatrixInPlace(arr8);
        print(arr8);

        // Rotate 2D Array
        System.out.println("Rotate 2D Array Test 1");
        int [][] arr9 = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr9);
        int [][] rotate2DArray = rotate2DArray(arr9);
        print(rotate2DArray);

        System.out.println("Rotate 2D Array Test 2");
        int [][] arr10 = {{1,2},{3,4},{5,6}};
        print(arr10);
        int [][] rotate2DArray2 = rotate2DArray(arr10);
        print(rotate2DArray2);

        // Pascal Triangle
        System.out.println("Pascal Triangle");
        int [][] pascalTriangle = pascalTriangle(5);
        print(pascalTriangle);

        // Print Spiral Matrix Test 1
        System.out.println("Print Spiral Matrix");
        int [][] arr11 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Original Matrix: Test 1");
        print(arr11);
        System.out.println("Print Spiral Matrix: Test 1");
        printSpiralMatrix(arr11);

        // Print Spiral Matrix Test 2
        System.out.println("Print Spiral Matrix");
        int [][] arr12 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix: Test 2");
        print(arr12);
        System.out.println("Print Spiral Matrix: Test 2");
        printSpiralMatrix(arr12);

        // Generate Spiral Matrix
        System.out.println("Generate Spiral Matrix for n = 4");
        int [][] spiralMatrix = generateSpiralMatrix(4);
        print(spiralMatrix);

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

    // Transpose Of Matrix
    public static int[][] transposeOfMatrix(int [][] arr){
        int [][] transposeMatrix = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                transposeMatrix[i][j] = arr[j][i];
            }
        }
        return transposeMatrix;
    }


    // Transpose Of Matrix In Place : Do not use extra space and create result array.
    // Note: This method will only work for square matrix. If you
    public static void transposeOfMatrixInPlace(int [][] arr){
        if(arr.length != arr[0].length){
            System.out.println("Transpose Of Matrix In Place Not Possible: Not A Square Matrix");
            return;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[0].length; j++){
                arr[i][j] = arr[i][j] + arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] = arr[i][j] - arr[j][i];
            }
        }
    }

    // Rotate 2D Array : Rotate 2D Array by 90 degree Clockwise.
    public static int[][] rotate2DArray(int [][] arr ){
        arr = transposeOfMatrix(arr);
        for(int i = 0; i < arr.length; i++){
            reverse(arr[i], 0 , arr[i].length - 1);
        }
        return arr;
    }

    // Pascal Triangle
    public static int[][] pascalTriangle(int n){
        int [][] pascalTriangle = new int[n][];
        for(int i =0; i < n; i++){
            // Each Row Has i+1 Elements
            pascalTriangle[i] = new int[i+1];
            // First and Last Element of Each Row is 1
            pascalTriangle[i][0] = pascalTriangle[i][i] = 1;

            // Fill Rest of the Element
            for(int j = 1; j < i; j++){
                pascalTriangle[i][j] = pascalTriangle[i-1][j] + pascalTriangle[i-1][j-1];
            }
        }
        return pascalTriangle;
    }

    // Print Spiral Matrix
    public static void printSpiralMatrix(int [][] arr){
        int topRow = 0;
        int bottomRow = arr.length - 1;
        int leftCol = 0;
        int rightCol = arr[0].length - 1;
        int totalElements = 0;
        while(totalElements < arr.length * arr[0].length){
            // topRow -> leftCol to rightCol
            for(int i  = leftCol; i <= rightCol && totalElements < arr.length * arr[0].length; i++){
                System.out.print(" "+arr[topRow][i]);
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && totalElements < arr.length * arr[0].length; i++){
                System.out.print(" "+arr[i][rightCol]);
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int i = rightCol; i >= leftCol && totalElements < arr.length * arr[0].length; i--){
                System.out.print(" "+arr[bottomRow][i]);
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && totalElements < arr.length * arr[0].length; i--){
                System.out.print(" "+arr[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
        System.out.println("\n");
    }

    // Generate a n*n matrix filled with elements 1 to n^2 in spiral order.
    public static int[][] generateSpiralMatrix(int n){
        int [][] spiralMatrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int totalElements = 0;
        int num = 1;

        while(totalElements < n * n){
            // topRow -> leftCol to rightCol
            for(int i = leftCol; i <= rightCol && totalElements < n * n ; i++){
                spiralMatrix[topRow][i] = num++;
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && totalElements < n *n; i++){
                spiralMatrix[i][rightCol] = num++;
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int i = rightCol; i >= leftCol && totalElements < n * n; i--){
                spiralMatrix[bottomRow][i] = num++;
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && totalElements < n * n; i--){
                spiralMatrix[i][leftCol] = num++;
                totalElements++;
            }
            leftCol++;
        }
        return spiralMatrix;
    }
}