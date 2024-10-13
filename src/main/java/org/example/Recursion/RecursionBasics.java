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
}