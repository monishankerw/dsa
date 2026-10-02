# 🚀 500 DSA Questions in Java


---

## 📚 Categories

### 🧩 1. Arrays (60 Questions)
Great list 👍
Below I’ve **classified all 60 problems into Easy / Medium / Hard**, and I’ve also **highlighted where `Set` and `Map` are commonly used** (Java-focused, interview-oriented).
ghj
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

# Java Coding Interview Questions — 7 Years Experience
## Complete Question Bank: Easy → Hard → Advanced

For **7 years Java/Spring Boot experience**, coding interviews can include not only DSA but also **Java internals, Streams, concurrency, LLD, design patterns, SQL, production-oriented coding, and implementation problems**.

---

# 1. String Coding — 30 Questions

### Easy

1. Reverse a String.
2. Reverse a String without using `reverse()`.
3. Check whether a String is palindrome.
4. Count vowels and consonants.
5. Count character frequency.
6. Find duplicate characters.
7. Remove duplicate characters.
8. Find first non-repeated character.
9. Find first repeated character.
10. Check whether two Strings are anagrams.
11. Check whether two Strings contain the same characters.
12. Find length without using `length()`.
13. Count words in a String.
14. Reverse each word in a sentence.
15. Reverse the complete sentence.
16. Find the longest word.
17. Find the shortest word.
18. Count occurrences of a given character.
19. Replace spaces with `%20`.
20. Remove all whitespace.

### Medium

21. Find longest substring without repeating characters.
22. Find longest substring with at most K distinct characters.
23. Find longest palindromic substring.
24. Find all permutations of a String.
25. Find all duplicate characters using Java 8 Streams.
26. Find first non-repeated character using Streams.
27. Find frequency of each word.
28. Group anagrams.
29. Check whether one String is rotation of another.
30. Implement String compression.

Example:

```text
Input:  aaabbcccc
Output: a3b2c4
```

---

# 2. Array Coding — 40 Questions

31. Find maximum element.
32. Find minimum element.
33. Find second-largest element.
34. Find second-smallest element.
35. Find duplicate elements.
36. Find missing number.
37. Find missing and duplicate number.
38. Find all duplicate numbers.
39. Remove duplicates from sorted array.
40. Reverse an array.
41. Rotate array left.
42. Rotate array right.
43. Move all zeroes to the end.
44. Move all negative numbers to one side.
45. Find frequency of elements.
46. Find common elements between two arrays.
47. Find intersection of two arrays.
48. Find union of two arrays.
49. Merge two sorted arrays.
50. Merge K sorted arrays.
51. Find pair with given sum.
52. Two Sum.
53. Three Sum.
54. Four Sum.
55. Find pair with minimum difference.
56. Find pair with maximum product.
57. Find majority element.
58. Find leaders in an array.
59. Find equilibrium index.
60. Find maximum subarray sum.
61. Maximum product subarray.
62. Find subarray with given sum.
63. Count subarrays with given sum.
64. Find longest subarray with given sum.
65. Find longest consecutive sequence.
66. Find duplicate without modifying array.
67. Find kth largest element.
68. Find kth smallest element.
69. Find top K frequent elements.
70. Find product of array except self.

---

# 3. Two Pointer — 20 Questions

71. Two Sum in sorted array.
72. Reverse array using two pointers.
73. Check palindrome using two pointers.
74. Remove duplicates from sorted array.
75. Move zeroes.
76. Move negative numbers.
77. Merge two sorted arrays.
78. Three Sum.
79. Four Sum.
80. Container With Most Water.
81. Trapping Rain Water.
82. Sort colors.
83. Pair with target sum.
84. Pair with closest sum.
85. Remove a specific element.
86. Squares of sorted array.
87. Valid palindrome after deleting one character.
88. Compare strings with backspaces.
89. Partition array.
90. Dutch National Flag problem.

---

# 4. Sliding Window — 20 Questions

91. Maximum sum subarray of size K.
92. Average of subarrays of size K.
93. First negative number in every window.
94. Maximum element in every window.
95. Minimum element in every window.
96. Longest substring without repeating characters.
97. Longest substring with K distinct characters.
98. Longest substring with at most K replacements.
99. Minimum window substring.
100. Permutation in String.
101. Find all anagrams in a String.
102. Longest repeating character replacement.
103. Maximum consecutive ones.
104. Maximum consecutive ones with K replacements.
105. Minimum size subarray sum.
106. Count subarrays with product less than K.
107. Longest subarray with at most K zeros.
108. Fruit Into Baskets.
109. Subarray with exactly K distinct elements.
110. Binary subarrays with sum.

---

# 5. HashMap / HashSet — 25 Questions

111. Find duplicate elements.
112. Find unique elements.
113. Find frequency of elements.
114. Find first non-repeated character.
115. Find first repeated character.
116. Two Sum.
117. Group Anagrams.
118. Longest consecutive sequence.
119. Find intersection.
120. Find union.
121. Find common elements.
122. Find elements appearing more than N/2 times.
123. Find elements appearing more than N/3 times.
124. Count pairs with given sum.
125. Count subarrays with given sum.
126. Longest subarray with zero sum.
127. Longest consecutive sequence.
128. Find missing number using HashSet.
129. Detect duplicate in range.
130. Find top K frequent elements.
131. Sort characters by frequency.
132. Isomorphic Strings.
133. Word Pattern.
134. Happy Number.
135. Longest substring without repeating characters.

---

# 6. Sorting — 20 Questions

136. Bubble Sort.
137. Selection Sort.
138. Insertion Sort.
139. Merge Sort.
140. Quick Sort.
141. Heap Sort.
142. Counting Sort.
143. Sort 0, 1, 2.
144. Sort array by frequency.
145. Sort String characters by frequency.
146. Merge intervals.
147. Insert interval.
148. Meeting Rooms.
149. Minimum meeting rooms.
150. Sort nearly sorted array.
151. Kth largest using sorting.
152. Kth smallest using sorting.
153. Find median of two sorted arrays.
154. Sort linked list.
155. External sorting concept.

---

# 7. Binary Search — 25 Questions

156. Basic binary search.
157. Find first occurrence.
158. Find last occurrence.
159. Count occurrences.
160. Search insertion position.
161. Find floor.
162. Find ceiling.
163. Search rotated sorted array.
164. Search rotated array with duplicates.
165. Find minimum in rotated array.
166. Find maximum in rotated array.
167. Find peak element.
168. Find square root.
169. Find nth root.
170. Find minimum eating speed.
171. Allocate minimum pages.
172. Ship packages within D days.
173. Aggressive cows.
174. Kth missing positive number.
175. Median of two sorted arrays.
176. Find smallest divisor.
177. Capacity to ship packages.
178. Minimum days to make bouquets.
179. Split array largest sum.
180. Binary search on answer.

---

# 8. Linked List — 30 Questions

181. Create a linked list.
182. Traverse linked list.
183. Insert at beginning.
184. Insert at end.
185. Insert at specific position.
186. Delete node.
187. Reverse linked list.
188. Reverse linked list recursively.
189. Find middle node.
190. Find nth node from end.
191. Remove nth node from end.
192. Detect cycle.
193. Find cycle starting point.
194. Find length of cycle.
195. Merge two sorted linked lists.
196. Merge K sorted linked lists.
197. Check palindrome linked list.
198. Find intersection of two linked lists.
199. Remove duplicates.
200. Sort linked list.
201. Add two numbers represented by linked lists.
202. Rotate linked list.
203. Reverse linked list in groups of K.
204. Reverse alternate K nodes.
205. Clone linked list with random pointer.
206. Flatten linked list.
207. Delete node without head pointer.
208. Partition linked list.
209. Reorder linked list.
210. Detect intersection efficiently.

---

# 9. Stack — 20 Questions

211. Implement Stack using Array.
212. Implement Stack using LinkedList.
213. Implement Stack using Queue.
214. Valid Parentheses.
215. Min Stack.
216. Max Stack.
217. Next Greater Element.
218. Next Smaller Element.
219. Previous Greater Element.
220. Previous Smaller Element.
221. Stock Span.
222. Largest Rectangle in Histogram.
223. Evaluate postfix expression.
224. Evaluate prefix expression.
225. Infix to postfix.
226. Infix to prefix.
227. Decode String.
228. Remove adjacent duplicates.
229. Simplify Unix path.
230. Balanced parentheses.

---

# 10. Queue / Deque — 15 Questions

231. Implement Queue using Array.
232. Implement Queue using Stack.
233. Circular Queue.
234. Priority Queue.
235. Deque implementation.
236. Sliding Window Maximum.
237. First non-repeating character in stream.
238. Generate binary numbers from 1 to N.
239. Rotten Oranges.
240. BFS traversal.
241. Level-order traversal.
242. Task scheduling.
243. CPU scheduling.
244. LRU Cache.
245. LFU Cache.

---

# 11. Binary Tree — 35 Questions

246. Create binary tree.
247. Inorder traversal.
248. Preorder traversal.
249. Postorder traversal.
250. Level-order traversal.
251. Recursive traversals.
252. Iterative traversals.
253. Height of tree.
254. Maximum depth.
255. Minimum depth.
256. Count nodes.
257. Count leaf nodes.
258. Sum of nodes.
259. Search element.
260. Check identical trees.
261. Check symmetric tree.
262. Invert binary tree.
263. Diameter of binary tree.
264. Maximum path sum.
265. Lowest Common Ancestor.
266. Check balanced binary tree.
267. Left view.
268. Right view.
269. Top view.
270. Bottom view.
271. Vertical traversal.
272. Zigzag traversal.
273. Boundary traversal.
274. Root-to-leaf paths.
275. Path sum.
276. Serialize binary tree.
277. Deserialize binary tree.
278. Build tree from preorder + inorder.
279. Build tree from postorder + inorder.
280. Find kth level nodes.

---

# 12. Binary Search Tree — 20 Questions

281. Create BST.
282. Insert into BST.
283. Search BST.
284. Delete node from BST.
285. Find minimum.
286. Find maximum.
287. Find kth smallest.
288. Find kth largest.
289. Validate BST.
290. Lowest Common Ancestor.
291. Convert sorted array to BST.
292. Convert BST to sorted array.
293. Find predecessor.
294. Find successor.
295. Find floor.
296. Find ceiling.
297. Recover corrupted BST.
298. BST iterator.
299. Two Sum in BST.
300. Balance an unbalanced BST.

---

# 13. Heap / PriorityQueue — 20 Questions

301. Implement Min Heap.
302. Implement Max Heap.
303. Kth largest element.
304. Kth smallest element.
305. Top K frequent elements.
306. K closest points.
307. Merge K sorted arrays.
308. Merge K sorted linked lists.
309. Median from data stream.
310. Minimum cost to connect ropes.
311. Task scheduler.
312. Top K frequent words.
313. Kth largest in stream.
314. Sort K-sorted array.
315. Find smallest range covering K lists.
316. IPO problem.
317. Meeting rooms.
318. Reorganize String.
319. Last Stone Weight.
320. Sliding window maximum using heap.

---

# 14. Recursion / Backtracking — 25 Questions

321. Factorial.
322. Fibonacci.
323. Sum of N numbers.
324. Reverse String recursively.
325. Reverse array recursively.
326. Generate subsets.
327. Generate permutations.
328. Generate combinations.
329. Combination Sum.
330. N-Queens.
331. Sudoku Solver.
332. Rat in a Maze.
333. Word Search.
334. Generate parentheses.
335. Letter combinations of phone number.
336. Palindrome partitioning.
337. Restore IP addresses.
338. Generate binary strings.
339. Generate valid parentheses.
340. Subset Sum.
341. Word Break.
342. Knight's Tour.
343. M-Coloring problem.
344. Josephus problem.
345. Tower of Hanoi.

---

# 15. Dynamic Programming — 30 Questions

346. Fibonacci using DP.
347. Climbing Stairs.
348. House Robber.
349. House Robber II.
350. Coin Change.
351. Coin Change II.
352. 0/1 Knapsack.
353. Unbounded Knapsack.
354. Subset Sum.
355. Partition Equal Subset Sum.
356. Longest Common Subsequence.
357. Longest Common Substring.
358. Longest Increasing Subsequence.
359. Longest Palindromic Subsequence.
360. Edit Distance.
361. Minimum Path Sum.
362. Unique Paths.
363. Unique Paths II.
364. Decode Ways.
365. Word Break.
366. Maximum Product Subarray.
367. Maximum Subarray.
368. Matrix Chain Multiplication.
369. Rod Cutting.
370. Egg Dropping.
371. Burst Balloons.
372. Palindrome Partitioning.
373. Stock Buy/Sell I.
374. Stock Buy/Sell II.
375. Stock Buy/Sell with cooldown.

---

# 16. Graph — 30 Questions

376. Represent graph using adjacency list.
377. Represent graph using adjacency matrix.
378. BFS.
379. DFS.
380. Detect cycle in undirected graph.
381. Detect cycle in directed graph.
382. Number of islands.
383. Clone graph.
384. Topological sort.
385. Course Schedule.
386. Course Schedule II.
387. Connected components.
388. Number of provinces.
389. Bipartite graph.
390. Dijkstra algorithm.
391. Bellman-Ford.
392. Floyd-Warshall.
393. Minimum Spanning Tree.
394. Prim's algorithm.
395. Kruskal's algorithm.
396. Union-Find.
397. Shortest path in unweighted graph.
398. Shortest path in weighted graph.
399. Network Delay Time.
400. Word Ladder.
401. Rotten Oranges.
402. Flood Fill.
403. Pacific Atlantic Water Flow.
404. Cheapest Flights.
405. Alien Dictionary.

---

# 17. Java 8 Stream Coding — 35 Very Important

406. Find duplicate integers using Streams.

407. Find unique integers.

408. Find frequency of numbers.

409. Find frequency of characters.

410. Find first non-repeated character.

411. Find first repeated character.

412. Find second-highest number.

413. Find third-highest number.

414. Find maximum number.

415. Find minimum number.

416. Sort List ascending.

417. Sort List descending.

418. Sort employees by salary.

419. Sort employees by name.

420. Find employees with salary > 100,000.

421. Group employees by department.

422. Count employees by department.

423. Find highest salary by department.

424. Find lowest salary by department.

425. Find average salary by department.

426. Find second-highest salary by department.

427. Partition employees based on salary.

428. Convert List<Employee> to Map.

429. Handle duplicate keys while converting to Map.

430. Join Strings using Collectors.

431. Find longest String.

432. Find shortest String.

433. Find String starting with a specific character.

434. Find numbers divisible by 2.

435. Find even and odd numbers.

436. Find sum and average.

437. Find duplicate words.

438. Group words by length.

439. Find common elements between two Lists.

440. Flatten nested Lists using `flatMap()`.

---

# 18. Multithreading Coding — 30 Questions

441. Create thread using Thread.
442. Create thread using Runnable.
443. Create thread using Callable.
444. Implement ExecutorService.
445. Implement FixedThreadPool.
446. Implement Producer-Consumer.
447. Implement thread-safe Singleton.
448. Implement thread-safe Counter.
449. Implement synchronized counter.
450. Implement AtomicInteger counter.
451. Demonstrate race condition.
452. Fix race condition.
453. Demonstrate deadlock.
454. Fix deadlock.
455. Implement ReadWriteLock.
456. Implement ReentrantLock.
457. Implement CountDownLatch.
458. Implement CyclicBarrier.
459. Implement Semaphore.
460. Implement ThreadLocal.
461. Execute tasks using CompletableFuture.
462. Combine two CompletableFuture results.
463. Run multiple APIs in parallel.
464. Handle CompletableFuture exception.
465. Implement timeout using CompletableFuture.
466. Implement retry mechanism.
467. Create custom ThreadPoolExecutor.
468. Implement bounded blocking queue.
469. Implement producer-consumer using BlockingQueue.
470. Implement scheduled task.

---

# 19. Advanced Java Coding — 25 Questions

471. Implement immutable class.
472. Implement Singleton — multiple approaches.
473. Implement Factory Pattern.
474. Implement Builder Pattern.
475. Implement Strategy Pattern.
476. Implement Observer Pattern.
477. Implement LRU Cache.
478. Implement LFU Cache.
479. Implement custom HashMap.
480. Implement custom ArrayList.
481. Implement custom LinkedList.
482. Implement custom Stack.
483. Implement custom Queue.
484. Implement custom Set.
485. Implement a rate limiter.
486. Implement token bucket.
487. Implement sliding-window rate limiter.
488. Implement retry mechanism.
489. Implement Circuit Breaker.
490. Implement cache with TTL.
491. Implement thread-safe cache.
492. Implement expiring map.
493. Implement object pool.
494. Implement connection pool concept.
495. Implement ID generator.

---

# 20. LLD Coding Questions — 30

496. Design Parking Lot.
497. Design Elevator System.
498. Design ATM.
499. Design Library Management System.
500. Design Movie Ticket Booking.
501. Design Car Rental System.
502. Design Hotel Booking.
503. Design Food Delivery.
504. Design Vending Machine.
505. Design Splitwise.
506. Design Chess.
507. Design Snake and Ladder.
508. Design Tic-Tac-Toe.
509. Design Logger.
510. Design Notification System.
511. Design Payment System.
512. Design Wallet.
513. Design Shopping Cart.
514. Design Coupon System.
515. Design Inventory System.
516. Design Ride Booking.
517. Design Meeting Scheduler.
518. Design File Storage.
519. Design URL Shortener.
520. Design Rate Limiter.
521. Design Cache.
522. Design Job Scheduler.
523. Design Task Queue.
524. Design ATM transaction processing.
525. Design Bank Account system.

---

# 21. Payment-Domain Coding Questions

These are particularly relevant to your experience.

526. Implement an idempotency mechanism.

527. Prevent duplicate payment requests.

528. Implement transaction status state machine.

529. Implement payment retry.

530. Implement payment timeout handling.

531. Implement transaction reconciliation.

532. Implement wallet debit.

533. Implement wallet credit.

534. Prevent concurrent wallet withdrawals.

535. Implement wallet balance update safely.

536. Handle two simultaneous withdrawals.

537. Implement transaction ledger.

538. Implement transaction audit trail.

539. Implement payment callback processing.

540. Make callback processing idempotent.

541. Implement OTP generation.

542. Implement OTP expiry.

543. Implement OTP retry limit.

544. Implement OTP rate limiting.

545. Implement merchant transaction search.

546. Implement transaction pagination.

547. Implement transaction export for millions of records.

548. Stream MongoDB transactions into Excel.

549. Implement batch processing of 5,000 records.

550. Implement failed-record retry.

---

# 22. Production-Level Coding Questions

551. Write code to retry a failed REST API three times.

552. Add exponential backoff.

553. Add timeout to an API call.

554. Implement Circuit Breaker logic.

555. Implement rate limiting.

556. Implement distributed locking.

557. Prevent duplicate API requests.

558. Implement idempotent REST API.

559. Process 1 million records without loading everything into memory.

560. Process a large CSV in batches.

561. Process a large Excel file efficiently.

562. Export millions of MongoDB records to Excel.

563. Implement pagination for millions of records.

564. Implement asynchronous processing.

565. Process records using ExecutorService.

566. Process records using CompletableFuture.

567. Implement Kafka consumer retry.

568. Implement Kafka duplicate-message protection.

569. Implement Dead Letter Queue processing.

570. Implement database batch insert.

571. Implement transaction retry.

572. Implement optimistic locking.

573. Implement pessimistic locking.

574. Implement cache-aside.

575. Implement cache invalidation.

---

# 23. SQL Coding — Advanced

576. Second-highest salary.

577. Nth-highest salary.

578. Top 3 employees per department.

579. Highest salary per department.

580. Employees earning more than department average.

581. Find duplicate records.

582. Delete duplicate records.

583. Find customers with no transactions.

584. Find customers with transactions in every month.

585. Find consecutive transaction dates.

586. Find longest consecutive transaction streak.

587. Running transaction total.

588. Running balance.

589. Month-over-month growth.

590. Day-over-day transaction comparison.

591. Find latest transaction per customer.

592. Find first transaction per customer.

593. Find customers with increasing transaction amounts.

594. Find duplicate transactions.

595. Find transactions greater than average.

596. Find top customers by transaction amount.

597. Rank transactions by amount.

598. Dense rank salary.

599. Row number per department.

600. Find gaps in transaction sequence.

---

# 24. Real Interview Coding Scenarios for 7 Years

These are **very important** because a 7-year interviewer may give you a business problem instead of LeetCode.

### Scenario 1 — Duplicate Payment

```text
POST /payment
Idempotency-Key: ABC123
```

Two requests arrive simultaneously.

**Question:** Write the logic to ensure only one payment is processed.

---

### Scenario 2 — Wallet Race Condition

```text
Balance = ₹10,000

Request A → Withdraw ₹8,000
Request B → Withdraw ₹8,000
```

Both requests arrive at the same time.

**Question:** Write a solution that prevents the balance from becoming negative.

---

### Scenario 3 — Kafka Duplicate

```text
Transaction ID = TXN123

Kafka delivers TXN123 twice.
```

**Question:** How will you make your consumer idempotent?

---

### Scenario 4 — Large MongoDB Export

```text
MongoDB
10 million transaction records
```

**Question:** Write code to export them to Excel without causing OutOfMemoryError.

---

### Scenario 5 — Bulk Employee Upload

```text
CSV = 500,000 employees
Batch size = 5,000
```

**Question:** Design the Java processing logic.

---

### Scenario 6 — Slow API

```text
Expected: 200 ms
Actual: 5 seconds
```

**Question:** What code/design changes would you investigate?

---

### Scenario 7 — Concurrent API Calls

```text
Service A
 ├── Service B
 ├── Service C
 └── Service D
```

B, C and D are independent.

**Question:** Write Java code using `CompletableFuture` to call them concurrently.

---

### Scenario 8 — Retry

```text
External API
   ↓
Failure
   ↓
Retry 1
   ↓
Retry 2
   ↓
Retry 3
   ↓
Failure → DLT
```

**Question:** Implement the retry logic.

---

# 🔥 Top 50 Coding Questions for a 7-Year Java Interview

If you have limited preparation time, prioritize these:

1. Two Sum
2. Three Sum
3. Longest substring without repeating characters
4. Longest palindromic substring
5. Group Anagrams
6. First non-repeating character
7. Character frequency
8. Merge sorted arrays
9. Move zeroes
10. Rotate array
11. Maximum subarray
12. Product except self
13. Subarray sum equals K
14. Longest consecutive sequence
15. Top K frequent elements
16. Kth largest element
17. Binary search
18. Search rotated array
19. Merge intervals
20. Meeting Rooms
21. Reverse linked list
22. Detect linked-list cycle
23. Merge two sorted linked lists
24. Remove Nth node
25. LRU Cache
26. Valid parentheses
27. Min Stack
28. Next Greater Element
29. Sliding Window Maximum
30. Binary tree traversals
31. Level-order traversal
32. Lowest Common Ancestor
33. Diameter of binary tree
34. Validate BST
35. BFS
36. DFS
37. Number of Islands
38. Detect graph cycle
39. Topological Sort
40. Dijkstra
41. Java Stream grouping
42. Second-highest salary using Streams
43. Duplicate elements using Streams
44. CompletableFuture parallel API calls
45. Producer-Consumer
46. Thread-safe Singleton
47. Custom HashMap
48. LRU Cache
49. Rate Limiter
50. **Idempotent Payment API**

## ⭐ What makes a 7-year coding round different?

At 7 years, don't stop after producing working code. The interviewer can continue:

**Problem → Code → Complexity → Edge cases → Thread safety → Scalability → Failure handling → Production use case**

For example, if asked **“Implement a cache”**, be prepared for:

```text
Basic Cache
   ↓
HashMap
   ↓
LRU
   ↓
TTL
   ↓
Thread Safety
   ↓
ConcurrentHashMap
   ↓
Memory limits
   ↓
Cache eviction
   ↓
Distributed cache
   ↓
Redis
   ↓
Failure handling
   ↓
Monitoring
```

For your Java/Spring Boot background, I would especially prepare **Java 8 Streams + HashMap internals + concurrency + CompletableFuture + LRU Cache + rate limiter + idempotency + Kafka duplicate handling + SQL + payment/wallet scenarios**.
# DSA Algorithms


Yes. I’ll separate the **Two Pointer** questions from your uploaded question bank. The source has a dedicated Two Pointer section with 20 questions. Pasted markdown

## 🔥 Two Pointer Questions — Separate List

### 🟢 Easy

1. **Two Sum in Sorted Array**
2. **Reverse Array Using Two Pointers**
3. **Check Palindrome Using Two Pointers**
4. **Remove Duplicates from Sorted Array**
5. **Move Zeroes**
6. **Move Negative Numbers**
7. **Merge Two Sorted Arrays**
8. **Pair with Target Sum**
9. **Remove a Specific Element**
10. **Squares of Sorted Array**

### 🟡 Medium

11. **Three Sum**
12. **Four Sum**
13. **Container With Most Water**
14. **Sort Colors**
15. **Pair with Closest Sum**
16. **Valid Palindrome After Deleting One Character**
17. **Compare Strings with Backspaces**
18. **Partition Array**
19. **Dutch National Flag Problem**

### 🔴 Hard

20. **Trapping Rain Water**

These are the **20 Two Pointer problems directly listed in your file**. Pasted markdown

### 🎯 Best practice order for Java interview

Start with:

**1 → 2 → 3 → 4 → 5 → 7 → 8 → 11 → 13 → 14 → 16 → 17 → 20**

This sequence gradually teaches:
`Left/Right Pointer → Sorted Array → Fast/Slow → Opposite Direction → Multiple Pointers → Advanced Two Pointer`

If you want, I can next give you **all 20 Two Pointer problems with LeetCode links + Java solution + example + time/space complexity**, one by one from Easy → Hard.

Sure. Here are the **20 Two Pointer questions** from your list with their **LeetCode links**. Pasted markdown

| # | Problem | LeetCode |
|---|---|---|
| 1 | Two Sum in Sorted Array | [Two Sum II – Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?utm_source=chatgpt.com) |
| 2 | Reverse Array Using Two Pointers | — No direct LeetCode problem |
| 3 | Check Palindrome Using Two Pointers | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/?utm_source=chatgpt.com) |
| 4 | Remove Duplicates from Sorted Array | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/?utm_source=chatgpt.com) |
| 5 | Move Zeroes | [Move Zeroes](https://leetcode.com/problems/move-zeroes/?utm_source=chatgpt.com) |
| 6 | Move Negative Numbers | — No exact direct LeetCode problem |
| 7 | Merge Two Sorted Arrays | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/?utm_source=chatgpt.com) |
| 8 | Three Sum | [3Sum](https://leetcode.com/problems/3sum/?utm_source=chatgpt.com) |
| 9 | Four Sum | [4Sum](https://leetcode.com/problems/4sum/?utm_source=chatgpt.com) |
| 10 | Container With Most Water | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/?utm_source=chatgpt.com) |
| 11 | Trapping Rain Water | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/?utm_source=chatgpt.com) |
| 12 | Sort Colors | [Sort Colors](https://leetcode.com/problems/sort-colors/?utm_source=chatgpt.com) |
| 13 | Pair With Target Sum | [Two Sum II – Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?utm_source=chatgpt.com) |
| 14 | Pair With Closest Sum | — No exact direct LeetCode problem |
| 15 | Remove a Specific Element | [Remove Element](https://leetcode.com/problems/remove-element/?utm_source=chatgpt.com) |
| 16 | Squares of Sorted Array | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/?utm_source=chatgpt.com) |
| 17 | Valid Palindrome After Deleting One Character | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/?utm_source=chatgpt.com) |
| 18 | Compare Strings With Backspaces | [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/?utm_source=chatgpt.com) |
| 19 | Partition Array | [Sort Colors](https://leetcode.com/problems/sort-colors/?utm_source=chatgpt.com) |
| 20 | Dutch National Flag Problem | [Sort Colors](https://leetcode.com/problems/sort-colors/?utm_source=chatgpt.com) |

The original file lists these under **Two Pointer — 20 Questions**. Pasted markdown

**Recommended order for you:**  
`Two Sum II → Valid Palindrome → Remove Duplicates → Move Zeroes → Merge Sorted Array → 3Sum → 4Sum → Container With Most Water → Sort Colors → Valid Palindrome II → Backspace Compare → Trapping Rain Water`

If you want, I can give you **#1 Two Sum II complete Java code + dry run + two-pointer explanation**, then continue **1 → 20**.
