# Equilibrium Index Array Problem

## Problem Description

Given an array, the **equilibrium index** is an index where the sum of elements on the left is equal to the sum of elements on the right. The goal is to find such an index if it exists. If no such index is found, return `-1`.

### Example

For example, given the array:

```java
[1, 2, 3, -4, 1, 6]
```

- The sum of elements to the left of index `3` (`-4`) is `6` (`1 + 2 + 3`).
- The sum of elements to the right of index `3` is `6` (`1 + 6`).

Thus, the equilibrium index is `3`.

### Problem Constraints

- You must consider both positive and negative integers.
- The input array can be of any size, but it should contain at least one element.

### Brute-Force Solution

In the brute-force approach, you calculate the sum of elements on the left and right for each index. This approach has a time complexity of `O(n^2)`.

### Optimal Solution (Using Prefix Sum)

To optimize, you can precompute the sum of elements using a prefix sum array. This allows you to find the equilibrium index in `O(n)` time.

## How to Solve the Problem

1. **Understand the Concept:** Make sure you understand the definition of an equilibrium index.
2. **Start with Brute Force:** Implement the brute-force solution first to grasp the basic idea.
3. **Optimize:** Think about how you can optimize the solution. Consider using prefix sums.
4. **Edge Cases:** Consider edge cases such as arrays with all elements being the same or arrays with only one element.

## Running the Code

- The code includes both brute-force and optimal methods.
- Test cases are provided in the `main` method for you to run and check the results.

## Complexity Analysis

- **Brute-Force Solution:** Time Complexity: `O(n^2)`, Space Complexity: `O(1)`
- **Optimal Solution:** Time Complexity: `O(n)`, Space Complexity: `O(n)`

