*Link*: https://leetcode.com/problems/middle-of-the-linked-list/description/

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
For this solution, I wanted to avoid iterating over the linked list twice (if possible):
* once to calculate the length
* second time to get the middle (half the linkned list)

# Approach
<!-- Describe your approach to solving the problem. -->
I used 2 counters:
* middle_count to track my middle index
* count to track the length of the whole link list

As I iterate over the entire linked-list, my middle pointer is moved only when necessary, hence I only need to traverse the linked-list once!

# Complexity
- Time complexity: $O(n)$
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $O(1)$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
