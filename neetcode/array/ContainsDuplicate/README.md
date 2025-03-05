*Link*: https://neetcode.io/problems/duplicate-integer

# 1. Sorting Method

## Approach

We sort the array, then use a pointer to traverse the array, checking its neighbour each time.

## Complexity

- Time complexity: $O(nlg(n))$

- Space complexity: $O(n)$


# 2. Hash Set Method

## Approach

A Hash Set set has the following crucial properties:

* does not allow duplicates (it is a set)
* `.contains()` has complexity $O(1)$
* `.add()` has complexity $O(1)$

## Complexity

- Time complexity: $O(n)$

- Space complexity: $O(n)$





