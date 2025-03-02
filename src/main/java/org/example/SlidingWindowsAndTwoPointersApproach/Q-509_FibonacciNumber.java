class FibonacciNumber {
    public int fib(int n){
        // Base case
        if ( n == 0 || n  == 1 ) return n;


        // Initialize the first two numbers
        int a = 0, b = 1, c = 0;

        // Start from 2 as we already know the first two numbers
        int i = 2;

        // Calculate the next number
        while ( i <= n ){
            c = a + b;
            a = b;
            b = c;
            i++;
        }

        // Return the nth Fibonacci number
        return c;
    }

    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();
        int n = 2;
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fib(n));

        n = 3;
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fib(n));

        n = 4;
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fib(n));

        n = 5;
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fib(n));

        n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fib(n));
    }


}