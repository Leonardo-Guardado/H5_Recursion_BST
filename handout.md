# Assignment: Recursion & Binary Search Trees (Java, IntelliJ + Maven)

## Overview

In this assignment you will practice **recursion** and **binary search trees (BSTs)** in Java using **IntelliJ** and **Maven**.
You will extend some given classes and implement a series of small, focused tasks.

You will submit your work as a **GitHub repository**. The repository structure and method names are fixed so it can be graded using automated tests.

---

## Learning Goals

By the end of this assignment, you should be able to:

- Implement and reason about simple recursive methods.
- Compare recursive and iterative solutions.
- Use helper methods to structure recursive solutions.
- Work with and extend a generic Binary Search Tree (BST) implementation.
- Use IntelliJ with Maven and GitHub for Java development.

---

## Getting Started

1. Download the starter project ZIP from your course site.
2. Unzip the archive somewhere on your computer.
3. Open IntelliJ and choose **File → Open…**.
4. Select the **folder that contains `pom.xml`** (the unzipped project root).
5. IntelliJ will detect this as a **Maven project** and import dependencies.
6. Once import is finished, you should see the following files (among others):

   ```text
   src/
     main/
       java/
         recursionexample/
           Linear.java            (provided)
           NonLinear.java         (provided)
           RecursionExercises.java (you implement)
         Tree.java                (provided)
         BST.java                 (provided)
         TestBST.java             (provided, you may extend)
         BSTExercises.java        (optional / extra credit)
   pom.xml
   ```

7. Confirm that the project compiles and you can run:
   - `recursionexample.Linear`
   - `recursionexample.NonLinear`
   - `TestBST`

---

## Submission Instructions

- Create a **GitHub repository** for your work (you can push the starter project there).
- Make sure your project keeps the same structure and class/method names.
- Commit your changes as you work (with meaningful commit messages).
- When you are done, push your latest code to GitHub and submit the **repository URL** as instructed.
- Your code must **compile** with `mvn -q -DskipTests compile` and run in IntelliJ with no errors.

---

## Part A – Recursion Mini-Tasks (`RecursionExercises.java`)

Create and edit:

```java
// File: src/main/java/recursionexample/RecursionExercises.java
package recursionexample;

public class RecursionExercises {
    // you will implement the methods described below
}
```

All methods in this section should be placed inside `RecursionExercises`.

---

### Task 1 – Recursive Factorial

Add the method:

```java
public static long factorialRecursive(int n)
```

**Requirements:**

- If `n < 0`, throw `IllegalArgumentException`.
- Base cases:
  - `factorialRecursive(0) == 1`
  - `factorialRecursive(1) == 1`
- Recursive case:
  - For `n > 1`, return `n * factorialRecursive(n - 1)`.
- You must use **recursion** (no loops).

---

### Task 2 – Iterative Factorial

Add the method:

```java
public static long factorialIterative(int n)
```

**Requirements:**

- Same input behavior and error handling as `factorialRecursive`.
- Implement this **without recursion** (use a loop).
- For all valid `n`, this method should return the same value as `factorialRecursive(n)`.

---

### Task 3 – Recursive Fibonacci

Add the method:

```java
public static long fibonacciRecursive(int n)
```

**Requirements:**

- If `n < 0`, throw `IllegalArgumentException`.
- Use the classic recursive definition:
  - `f(0) = 0`
  - `f(1) = 1`
  - `f(n) = f(n - 1) + f(n - 2)` for `n >= 2`.
- Do **not** use loops in this method.
- Do **not** call any already-existing Fibonacci implementations; implement the recursion yourself.

---

### Task 4 – Recursive Sum of an Array (with Helper)

Add the method:

```java
public static long sumArray(int[] data)
```

and a private helper:

```java
private static long sumArrayFromIndex(int[] data, int index)
```

**Requirements:**

- If `data` is `null`, throw `IllegalArgumentException`.
- If `data.length == 0`, return `0`.
- `sumArray` should call the helper method starting at index 0.
- Recursive idea in the helper:
  - Base case: if `index == data.length`, return `0`.
  - Recursive case: return `data[index] + sumArrayFromIndex(data, index + 1)`.

---

### Task 5 – Recursive String Reverse

Add the method:

```java
public static String reverse(String s)
```

**Requirements:**

- If `s == null`, return `null`.
- If `s.length() <= 1`, return `s` unchanged.
- Otherwise, recursively reverse the substring and move the first character to the end.
  - Example: `reverse("cat")` should return `"tac"`.
- You must use **recursion**, not loops.

---

## Part B – BST Mini-Tasks (`BST.java` & `BSTExercises.java`)

You are given a generic BST implementation in `BST.java` and an interface `Tree.java`.

You will **extend `BST` with new methods** that are easy to test automatically.

> **Important:** Do **not** change any existing public method signatures in `BST.java`.  
> You may **add** new methods as specified below.

The class `BST` and its inner `TreeNode` class are already defined for you. You will add methods to `BST<E>` directly.

---

### Task 6 – Tree Height (Recursive)

In `BST<E>`, add:

```java
public int height()
```

and a helper:

```java
private int height(TreeNode<E> node)
```

**Definition:**

- Height of an empty tree (`root == null`): `-1`
- Height of a single-node tree: `0`
- In general: `1 + max(height(left), height(right))`

**Hint:**

```java
public int height() {
    return height(root);
}
```

with a recursive `height(TreeNode<E> node)` implementation.

---

### Task 7 – Count Leaves

In `BST<E>`, add:

```java
public int countLeaves()
```

and helper:

```java
private int countLeaves(TreeNode<E> node)
```

**Definition:**

- A **leaf** is a node with no children (both `left` and `right` are `null`).
- An empty tree has `0` leaves.

**Recursive idea:**

- If `node == null`: return `0`.
- If `node.left == null` and `node.right == null`: return `1`.
- Otherwise: return `countLeaves(node.left) + countLeaves(node.right)`.

---

### Task 8 – Minimum and Maximum Element

In `BST<E>`, add:

```java
public E min()
public E max()
```

**Requirements:**

- If the tree is empty (`root == null`), both methods should return `null`.
- `min()` returns the smallest element in the tree (the left-most node).
- `max()` returns the largest element in the tree (the right-most node).

**Hint:**

- For `min()`:
  - Start at `root` and follow `left` links until `left` is `null`.
- For `max()`:
  - Start at `root` and follow `right` links until `right` is `null`.

---

### Task 9 – Convert Tree to Sorted List (Inorder Traversal)

In `BST<E>`, add:

```java
public java.util.List<E> toSortedList()
```

and a helper:

```java
private void toSortedList(TreeNode<E> node, java.util.List<E> result)
```

**Requirements:**

- `toSortedList()` returns a **new** `java.util.ArrayList<E>` containing all elements in **ascending order**.
- Do **not** modify the tree structure.
- Implement this using a **recursive inorder traversal**:
  - Traverse left subtree
  - Add current node’s element
  - Traverse right subtree

---

### Task 10 – Check if the Tree is Height-Balanced

A tree is **height-balanced** if, for every node, the height difference between its left and right subtrees is at most 1.

In `BST<E>`, add:

```java
public boolean isBalanced()
```

You may implement this via a helper method that computes height while checking for imbalance, e.g.:

```java
private int heightOrUnbalanced(TreeNode<E> node)
```

**Suggested strategy:**

- For each node, compute the heights of left and right subtrees.
- If the difference is greater than 1, return a special value (e.g., `-2`) to indicate “unbalanced” and propagate it upward.
- If any subtree is already unbalanced, keep returning the special value.
- `isBalanced()` returns `true` if the final result is **not** the special unbalanced value, and `false` otherwise.

---

## Part C – Optional / Extra Credit (`BSTExercises.java`)

This part is **optional** and may earn extra credit if specified by your instructor.

In the file:

```java
// File: src/main/java/BSTExercises.java
public class BSTExercises {
    // you will add a static method here
}
```

implement:

### Task 11 (Optional) – Build a BST from an Array

Add the method:

```java
public static BST<Integer> fromArray(int[] values)
```

**Requirements:**

- If `values == null`, throw `IllegalArgumentException`.
- Create a new `BST<Integer>`.
- Insert each element of the array into the BST in order.
- Return the resulting tree.

Tests will check:

- The size of the BST matches `values.length`.
- Traversing the tree with `toSortedList()` yields a sorted list of the inserted integers.

---

## Grading & Tips

- Grading will largely be done using **tests** that call the methods with various inputs.
- Keep class names, method names, parameters, and return types **exactly** as specified.
- Do not change package declarations.
- Write small tests in `main` methods or JUnit (if you know how) to check your code as you go.
- Commit often with clear messages (e.g., `feat: implement recursive factorial`).

If your code compiles, follows these specifications, and passes the hidden tests, you will receive full credit.
