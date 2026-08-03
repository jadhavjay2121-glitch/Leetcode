# 0007. Reverse Integer

## Problem
Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing the integer causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, return `0`.

---

## Examples

### Example 1
Input:
```
x = 123
```
Output:
```
321
```

### Example 2
Input:
```
x = -123
```
Output:
```
-321
```

### Example 3
Input:
```
x = 120
```
Output:
```
21
```

---

## Approach

1. Extract the last digit using `% 10`.
2. Remove the last digit using `/ 10`.
3. Before updating the reversed number, check for integer overflow.
4. Build the reversed number using:
   ```
   rev = rev * 10 + digit
   ```
5. Repeat until the input becomes `0`.

---

## Algorithm

1. Initialize `rev = 0`.
2. While `x != 0`:
   - Extract last digit.
   - Check for overflow.
   - Update `rev`.
   - Remove last digit from `x`.
3. Return `rev`.

---

## Time Complexity

**O(log₁₀ N)**

---

## Space Complexity

**O(1)**

---

## Language

Java ☕

---

## LeetCode

Problem #7 - Reverse Integer

---

⭐ If you found this repository helpful, consider giving it a star!
