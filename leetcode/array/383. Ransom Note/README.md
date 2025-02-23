# 383. Ransom Note

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We simply need to keep an array that tracks the count of each char occurence. The moment we encounter a negative, that means `magazine` is unable to construct `ransomeNote`!

# Approach
<!-- Describe your approach to solving the problem. -->
An array is sufficiently fast in this case in my opinion.

A useful approach that was used was using ASCII value to index the array:
* as seen in `countArray[x-'a']`

# Complexity
- Time complexity: $\theta(n)$