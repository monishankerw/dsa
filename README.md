# 🚀 500 DSA Questions in Java


---

## 📚 Categories

### 🧩 1. Arrays (60 Questions)
Great list 👍
Below I’ve **classified all 60 problems into Easy / Medium / Hard**, and I’ve also **highlighted where `Set` and `Map` are commonly used** (Java-focused, interview-oriented).

---

## 🟢 EASY (Basics + Simple Set / Map usage)

1. Find Largest Element in Array
2. Find Smallest Element in Array
3. Reverse an Array
4. Find Missing Number in Sequence
5. Find Duplicate Elements *(Set)*
6. Remove Duplicates from Array *(Set)*
7. Check if Array is Sorted
8. Rotate Array Left/Right
9. Move All Zeros to End
10. Second Largest Element
11. Merge Two Sorted Arrays
12. Union of Two Arrays *(Set)*
13. Intersection of Two Arrays *(Set)*
14. Count Frequency of Each Element *(Map)*
15. Find Pair with Given Sum *(Set / Map)*
16. Leaders in an Array
17. Sort 0s, 1s, 2s (Dutch National Flag)
18. Find Median of Array
19. Minimum and Maximum in Array
20. Find Kth Largest Element
21. Find Kth Smallest Element
22. Find All Subarrays
23. Find Peak Element
24. Cyclically Rotate Array by One
25. Missing Number XOR Approach
26. Find Array is Palindrome
27. Binary Search on Sorted Array

👉 **Main DS used:**

* `HashSet`
* `HashMap`
* Basic loops

---

## 🟡 MEDIUM (Logic + Optimization + Heavy Map/Set)

16. Find Triplets with Given Sum *(Set)*
17. Kadane’s Algorithm (Maximum Subarray Sum)
18. Subarray with Given Sum *(Map)*
19. Equilibrium Index
20. Rearrange Positive and Negative Numbers
21. Longest Consecutive Subsequence *(Set)*
22. Majority Element (Boyer-Moore Algorithm)
23. Missing and Repeating Number
24. Product of Array Except Self
25. Merge Overlapping Intervals
26. Maximum Difference between Two Elements
27. Count Inversions in Array
28. Find Common Elements in Three Arrays *(Set)*
29. Minimum Swaps to Sort Array
30. Rearrange Alternating Positive and Negative
31. Max Product Subarray
32. Longest Subarray with Sum 0 *(Map)*
33. Smallest Subarray with Sum > X
34. Next Permutation
35. Count Subarrays with Equal 0s and 1s *(Map)*
36. Find Duplicates in O(n)
37. Minimum Element in Rotated Sorted Array
38. Find Pivot Index
39. Count Pairs with Given XOR *(Map)*
40. Rearrange Array in Zigzag Form
41. Count Distinct Elements in Window *(Map)*

👉 **Main DS used:**

* `HashMap` (prefix sum, frequency)
* `HashSet`
* Sliding Window
* Greedy logic

---

## 🔴 HARD (Advanced Logic + Multiple Concepts)

45. Trapping Rain Water Problem
46. Stock Buy and Sell *(multiple transactions variants)*
47. Find Minimum Number of Platforms (Train Problem)
48. Longest Increasing Subsequence
49. Merge K Sorted Arrays
50. Smallest Positive Missing Number
51. Maximum Circular Subarray Sum

👉 **Main DS used:**

* Advanced DP
* PriorityQueue
* Prefix/Suffix arrays
* Greedy + Kadane variants

---

## 🎯 INTERVIEW TIP (Very Important for You – 4.8+ yrs)

If you master **these with Map/Set**, you’re interview-ready:

* Subarray with Given Sum
* Longest Subarray with Sum 0
* Count Frequency of Elements
* Pair / Triplet Sum
* Longest Consecutive Subsequence
* Count Distinct in Window
* XOR based problems

---
Perfect 👍
Below are **Paytm / PhonePe / Pay10–level Array + Map/Set interview questions**, exactly aligned to **fintech backend roles (4–5 yrs experience)** like yours.

I’ve grouped them **round-wise** and marked **difficulty + key DS used**.

---

## 🟢 ROUND 1 – Screening / Machine Coding (Easy → Medium)

> Focus: **Clean logic + correct output**

### 1️⃣ Transaction Frequency

**Question:**
Given an array of transaction IDs, count how many times each transaction occurred.

📌 **Use:** `HashMap`
📊 **Difficulty:** Easy

---

### 2️⃣ First Non-Repeating Transaction

**Question:**
Given an array of transaction IDs, find the **first transaction that occurred only once**.

📌 **Use:** `LinkedHashMap`
📊 **Difficulty:** Easy

---

### 3️⃣ Duplicate Transactions Detection

**Question:**
Find all duplicate transaction IDs from a large array.

📌 **Use:** `HashSet`
📊 **Difficulty:** Easy

---

### 4️⃣ Validate Sorted Transactions

**Question:**
Check if transaction timestamps are sorted.

📌 **Use:** Loop
📊 **Difficulty:** Easy

---

### 5️⃣ Two Transactions with Given Amount

**Question:**
Find if any two transaction amounts sum to a given value.

📌 **Use:** `HashSet`
📊 **Difficulty:** Medium

---

## 🟡 ROUND 2 – Core Coding (Real Paytm / PhonePe Style)

> Focus: **Efficiency + Map / Prefix Sum**

### 6️⃣ Fraud Detection – Zero Balance Window

**Question:**
Find the **longest subarray with sum = 0** in transaction amounts.

📌 **Use:** `HashMap` (prefix sum)
📊 **Difficulty:** Medium ⭐⭐

---

### 7️⃣ Daily Settlement Window

**Question:**
Find a continuous transaction window whose sum equals a given settlement amount.

📌 **Use:** `HashMap` / Sliding Window
📊 **Difficulty:** Medium

---

### 8️⃣ Consecutive Transaction IDs

**Question:**
Find the longest sequence of consecutive transaction IDs.

📌 **Use:** `HashSet`
📊 **Difficulty:** Medium ⭐⭐

---

### 9️⃣ Majority Transaction Source

**Question:**
Find the transaction source that appears more than N/2 times.

📌 **Use:** Boyer–Moore
📊 **Difficulty:** Medium

---

### 🔟 Distinct Transactions per Time Window

**Question:**
Given a window size `k`, count distinct transaction IDs in each window.

📌 **Use:** `HashMap`
📊 **Difficulty:** Medium ⭐⭐

---

## 🟡 ROUND 3 – Business Logic + Optimization

> Focus: **Thinking + Edge cases**

### 1️⃣1️⃣ Missing & Duplicate Transaction ID

**Question:**
One transaction ID is missing and another is duplicated. Find both.

📌 **Use:** Math / XOR
📊 **Difficulty:** Medium

---

### 1️⃣2️⃣ Settlement Peak Load

**Question:**
Find the maximum subarray sum (maximum revenue window).

📌 **Use:** Kadane’s Algorithm
📊 **Difficulty:** Medium

---

### 1️⃣3️⃣ Smallest Window Exceeding Risk Threshold

**Question:**
Find the smallest subarray whose sum is greater than X.

📌 **Use:** Sliding Window
📊 **Difficulty:** Medium ⭐⭐

---

### 1️⃣4️⃣ Circular Transactions (Day Wrap)

**Question:**
Transactions are circular. Find the maximum circular sum.

📌 **Use:** Kadane variant
📊 **Difficulty:** Hard ⭐⭐⭐

---

### 1️⃣5️⃣ High-Value Transaction Triplets

**Question:**
Find all triplets whose sum equals a target.

📌 **Use:** Sorting + Set
📊 **Difficulty:** Medium–Hard

---

## 🔴 ROUND 4 – Advanced / Senior Level

> Focus: **Scale + Optimization**

### 1️⃣6️⃣ Transaction Reconciliation

**Question:**
Find common transaction IDs across **3 different systems**.

📌 **Use:** `HashSet`
📊 **Difficulty:** Medium–Hard

---

### 1️⃣7️⃣ Kth Highest Transaction

**Question:**
Find the Kth largest transaction amount.

📌 **Use:** Heap / QuickSelect
📊 **Difficulty:** Medium–Hard

---

### 1️⃣8️⃣ Fraud Spike Detection

**Question:**
Find the longest increasing sequence of transaction amounts.

📌 **Use:** DP / Binary Search
📊 **Difficulty:** Hard ⭐⭐⭐

---

### 1️⃣9️⃣ Platform Load Problem

**Question:**
Given transaction start and end times, find the minimum servers needed.

📌 **Use:** Sorting + Greedy
📊 **Difficulty:** Hard ⭐⭐⭐

---

### 2️⃣0️⃣ Wallet Balance Consistency

**Question:**
Product of array except self (no division).

📌 **Use:** Prefix & Suffix
📊 **Difficulty:** Medium

---

## 💡 INTERVIEWER EXPECTATION (VERY IMPORTANT)

They expect you to:

* Write **O(n)** or **O(n log n)** solutions
* Use `Map` / `Set` **naturally**
* Explain **why this approach scales**
* Handle **edge cases** (null, duplicates, negatives)

---

## 🔥 MUST-PRACTICE (Top 10 for Fintech)

1. Longest Subarray with Sum 0
2. Subarray with Given Sum
3. Count Distinct in Window
4. Pair Sum
5. Triplet Sum
6. Kadane’s Algorithm
7. Longest Consecutive Subsequence
8. Kth Largest Element
9. Product Except Self
10. Minimum Platforms Problem

---





---

### 🔢 2. Numbers & Math (40 Questions)
1. Palindrome Number  
2. Armstrong Number  
3. Prime Number Check  
4. Factorial (Iterative & Recursive)  
5. Count Digits  
6. Reverse a Number  
7. GCD / HCF of Two Numbers  
8. LCM of Two Numbers  
9. Fibonacci Series  
10. Check Perfect Number  
11. Strong Number  
12. Spy Number  
13. Neon Number  
14. Disarium Number  
15. Automorphic Number  
16. Happy Number  
17. Sum of Digits  
18. Product of Digits  
19. Power of Number  
20. Check Leap Year  
21. Convert Binary to Decimal  
22. Convert Decimal to Binary  
23. Convert Decimal to Octal  
24. Convert Octal to Decimal  
25. Count Number of Prime Digits  
26. Prime Factorization  
27. Check Harshad (Niven) Number  
28. Count Trailing Zeros in Factorial  
29. Check Palindromic Prime  
30. Sum of N Natural Numbers  
31. Calculate nCr and nPr  
32. Check Perfect Square  
33. Count Factors of a Number  
34. Find LCM of Array  
35. Sum of Digits until Single Digit  
36. Add Two Fractions  
37. Binary Addition  
38. Decimal to Hexadecimal  
39. Factorial using BigInteger  
40. Count Set Bits in Integer  

---

### 🔤 3. Strings (60 Questions)
1. Reverse a String  
2. Check Palindrome String  
3. Check Anagram Strings  
4. Count Vowels and Consonants  
5. Count Words in String  
6. Remove Duplicates from String  
7. Remove Whitespaces  
8. Find First Non-Repeating Character  
9. Find All Substrings  
10. Check Pangram String  
11. Check Rotation of Another String  
12. Longest Common Prefix  
13. Longest Palindromic Substring  
14. Convert to Uppercase / Lowercase  
15. Replace Character in String  
16. Frequency of Characters  
17. Count Digits and Alphabets  
18. Reverse Each Word in String  
19. Swap First and Last Word  
20. String Compression  
21. Remove Character from String  
22. Toggle Case  
23. Check for Balanced Parentheses  
24. Find Duplicate Words  
25. Check for Isogram String  
26. Sort Characters Alphabetically  
27. Find Maximum Occurring Character  
28. Check String Rotation  
29. Count Occurrence of Substring  
30. Check for Subsequence  
31. Remove Special Characters  
32. Reverse Words Order  
33. Validate Email Format  
34. Implement Custom Split Function  
35. Find All Permutations of String  
36. Check Two Strings are Same Ignoring Case  
37. Check Palindromic Subsequence  
38. Count Punctuation Characters  
39. Remove Consecutive Duplicates  
40. Convert String to Integer (atoi)  
41. Find Longest Word  
42. Find Smallest Word  
43. Remove Digits from String  
44. Find Palindromic Words  
45. Replace Word in Sentence  
46. Find Most Frequent Word  
47. Check if String Contains Only Alphabets  
48. Find Shortest Distance Between Words  
49. Check String EndsWith or StartsWith  
50. Find Lexicographically Largest Substring  
51. Print All Subsets of a String  
52. Check if String Can Form Palindrome  
53. Validate Password Strength  
54. Find Longest Repeating Substring  
55. Reverse Sentence without Extra Space  
56. Compare Strings without Built-in Function  
57. Find Common Characters in Strings  
58. Check One Edit Distance  
59. Longest Word Palindrome  
60. Longest Subsequence Palindrome  

---

### ⚙️ 4. Recursion (40 Questions)
1. Factorial Using Recursion  
2. Fibonacci Using Recursion  
3. Print Numbers 1 to N  
4. Sum of Digits Using Recursion  
5. Reverse a Number Using Recursion  
6. GCD Using Recursion  
7. Power Function Using Recursion  
8. Print Array Elements Recursively  
9. Find Min and Max in Array Recursively  
10. Reverse String Using Recursion  
11. Palindrome String Using Recursion  
12. Binary Search Recursively  
13. Sum of Array Elements Recursively  
14. Print Permutations of String  
15. Tower of Hanoi  
16. Subset Sum Problem  
17. Print All Subsequences  
18. Nth Fibonacci Using Memoization  
19. Sum of N Natural Numbers Recursively  
20. Generate Balanced Parentheses  
21. Print All Binary Strings  
22. Count Occurrences Recursively  
23. Multiply Two Numbers Recursively  
24. Add Digits Until Single Digit Recursively  
25. Find Power of 2 Numbers Recursively  
26. Calculate x^n (Exponentiation by Squaring)  
27. Find All Combinations of Array  
28. Print All Palindromic Subsequences  
29. Word Break Problem  
30. Print All Paths in Matrix  
31. Count Vowels Recursively  
32. Print Reverse of Linked List Recursively  
33. Nth Tribonacci Number  
34. Generate Pascal’s Triangle  
35. Permutations with Repetitions  
36. Generate Binary Numbers  
37. Solve Rat in a Maze  
38. Subset Generation  
39. Sudoku Solver  
40. Solve N-Queens Problem  

---

### 🧮 5. Sorting & Searching (40 Questions)
- Bubble Sort  
- Selection Sort  
- Insertion Sort  
- Merge Sort  
- Quick Sort  
- Heap Sort  
- Counting Sort  
- Radix Sort  
- Bucket Sort  
- Binary Search  
- Linear Search  
- Jump Search  
- Interpolation Search  
- Exponential Search  
- Fibonacci Search  
- Search in Rotated Sorted Array  
- Search Element in 2D Matrix  
- Find Floor and Ceil in Sorted Array  
- Find Missing Number in Sorted Array  
- Find First and Last Occurrence  
- Find Peak Element (Binary Search Based)  
- Count Occurrences in Sorted Array  
- Median of Two Sorted Arrays  
- Square Root (Binary Search)  
- Aggressive Cows Problem  
- Allocate Minimum Pages  
- Painter Partition Problem  
- Search Infinite Array  
- Smallest Element in Rotated Array  
- Minimum Number in Rotated Array  
- Find Element in Nearly Sorted Array  
- Book Allocation Problem  
- Koko Eating Bananas  
- Ship Packages Within Days  
- Find Single Element in Sorted Array  
- Find Missing Element (XOR Method)  
- Count Triplets with Sum Smaller than Target  
- Find Pair with Given Difference  
- Count Pairs with Sum Divisible by K  
- Minimum Time to Make Ropes Equal  

---

### 💡 Other Advanced Topics (260 Questions)
- Linked List (50)
- Stack (25)
- Queue (25)
- Trees (50)
- Graphs (50)
- Dynamic Programming (50)
- Heap / Priority Queue (20)
- Backtracking (20)
- Bit Manipulation (20)

---



---

## 🏗️ Folder Structure
