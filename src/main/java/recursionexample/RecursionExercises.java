package recursionexample;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    public static long factorialRecursive(int n) {
        // TODO: implement Task 1
        //result integer
        //if n is less than zero (not possible for factorial)
        if (n < 0){
            throw new IllegalArgumentException("Cannot be less than one");
        }
        //If n is equal to either 1 or 0
        else if(n <= 1){
            n = 1;
        }
        //If n is greater than one
        return n * factorialRecursive(n -1);
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        // TODO: implement Task 2
        long result = 0;

        if (n < 0){
            throw new IllegalArgumentException("Cannot be less than zero");
        }
        for (int i = 0; n > 0; i++){
            if (n == 1){
                result *= 1;
                break;
            }
            result *= n * (n-1);
        }
        return result;
    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        if (n < 0){
            throw new IllegalArgumentException();
        }
        else if(n <= 1){
            n = 1;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        if (data == null){
            throw new IllegalArgumentException();
        }
        if (data.length == 0){
            return 0;
        }
        long result = sumArrayFromIndex(data, 0);

        return result;
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        if (index == data.length){
            return 0;
        }
        return data[index] + sumArrayFromIndex(data, index + 1);
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        if (s == null | s.length() <= 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
