class RecursionBasics {
    public static void main(String[] args) {
        // Print 1 to n using recursion Example
        System.out.println("Print 1 to n using recursion Example:");
        print1ToN(5);
        System.out.println();

        // Print n to 1 using recursion Example
        System.out.println("Print n to 1 using recursion Example:");
        printNTo1(5);

        // Factorial of 'n' using recursion.
        System.out.println("Factorial of 'n' using recursion Example:");
        System.out.print("Factorial of 5 is : ");
        System.out.println(factorial(5));

        // Fibonacci Series using recursion
        System.out.println("Fibonacci Series using recursion Example:");
        System.out.print("Fibonacci Series till 10 is : ");
        for(int i = 0; i <= 10; i++){
            System.out.print(fibonacci(i)+" ");
        }

        // Find the sum of digits using recursion
        System.out.println("\nFind the sum of digits using recursion Example:");
        System.out.print("Sum of digits of 123 is : ");
        System.out.println(sumOfDigits(123));

        // Count the number of digits in a number using recursion
        System.out.println("Count the number of digits in a number using recursion Example:");
        System.out.print("Number of digits in 123 is : ");
        System.out.println(countNumberOfDigits(-123));

        // Find the power of a number using recursion
        System.out.println("Find the power of a number using recursion Example:");
        System.out.print("2^3 is : ");
        System.out.println(power(2,3));
    }

    // Date: 12/10/2024
    // Print 1 to n using recursion
    public static void print1ToN(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        print1ToN(n-1);
        System.out.print(n+" ");
    }

    // Date: 12/10/2024
    // Print n to 1 using recursion
    public static void printNTo1(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }

        System.out.print(n+" ");
        printNTo1(n-1);
    }

    // Date: 13/10/2024
    // Find the value of n factorial ?
    public static int factorial(int n){
        // base case
        if(n == 0){
            return 1;
        }

        // self work
        int fact = n * factorial(n-1);
        return fact;
    }

    // Date: 14/10/2024
    // Fibonacci Series using recursion
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Date: 15/10/2024
    // Find the sum of digits using recursion
    public static int sumOfDigits(int n){
        if(n >= 0 && n <= 9){
            return n;
        }

        return n%10 + sumOfDigits(n/10);
    }

    // Date: 15/10/2024
    // Count the number of digits in a number using recursion
    public static int countNumberOfDigits(int n){
        if(n >= 0 && n <= 9){
            return 1;
        }
       return  1 + countNumberOfDigits(Math.abs(n)/10);
    }

    // Date: 16/10/2024
    // Find the power of a number using recursion
    public static int power(int n, int p){
        if(p == 0){
            return 1;
        }

        return n * power(n,p-1);
    }


}