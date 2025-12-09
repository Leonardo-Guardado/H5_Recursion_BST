package recursionexample;

import java.util.Arrays;

public class RecursionExerciseDriver {
    public static void main(String[] args){
        //Factorial Recursive
        RecursionExercises recursion = new RecursionExercises();
        long l;
        int n = 5;
        l = recursion.factorialRecursive(5);
        System.out.println("Recursive Factorial of [" + n + "] = [" + l + "]");

        //Factorial Iterative
        RecursionExercises iter = new RecursionExercises();
        long m;
        m = iter.factorialIterative(n);
        System.out.println("Iterative Factorial of [" + n + "] = [" + m + "]");

        //Fibonacci Recursive
        RecursionExercises fibonacci = new RecursionExercises();
        for (int i = 0; i <= n; i++){
            System.out.println("Fibonacci index [" + i + "] has value [" + fibonacci.fibonacciRecursive(i) + "]");
        }

        //Sum or array
        RecursionExercises sum = new RecursionExercises();
        int[] data = {44, 21, 68, 55, 92};
        long s = sum.sumArray(data);
        System.out.println("Sum of the array " + Arrays.toString(data) + " = [" + s + "]");

        //Reverse String Recursive
        RecursionExercises rev = new RecursionExercises();
        String string = "Hello";
        String reverse = "";
        reverse = rev.reverse(string);
        System.out.println("The reverse of string " + string + " is " + reverse);
    }
}
