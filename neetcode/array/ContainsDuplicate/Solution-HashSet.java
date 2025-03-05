class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Hash Set
        Set<Integer> checkSet = new HashSet<>();

        for (int i: nums) {
            if (checkSet.contains(i)) return true;
            checkSet.add(i);
        }
        return false;
    }
}