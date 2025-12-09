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
        if(n == 0 | n == 1){
            return 1;
        }
        //If n is greater than one
        else{
            return n * factorialRecursive(n-1);
        }
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        // TODO: implement Task 2
        //Prevent the result from multiplying a zero
        long result = 1;
        //Throw Exception
        if (n < 0){
            throw new IllegalArgumentException("Cannot be less than zero");
        }
        //Returning 1 for the base case
        if (n == 0 | n ==1){
            return 1;
        }
        //Multiplying result by the next number without recursion
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        //Thorw Exception
        if (n < 0){
            throw new IllegalArgumentException();
        }
        //Returns the base values without change
        else if(n <= 1){
            return n;
        }
        //Nonlinear Recursion until reaching the base cases
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        //Throws Exception
        if (data == null){
            throw new IllegalArgumentException();
        }
        //If the array is empty
        if (data.length == 0){
            return 0;
        }
        //Final result
        long result = sumArrayFromIndex(data, 0);

        return result;
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        //If the array has no values
        if (index == data.length){
            return 0;
        }
        //Recursion, adding the index to the next index until array ends
        return data[index] + sumArrayFromIndex(data, index + 1);
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        //Base cases for the string
        if (s == null | s.length() <= 1){
            return s;
        }
        //Splits string from index 1 forward and prints out the first character (Recursive)
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
