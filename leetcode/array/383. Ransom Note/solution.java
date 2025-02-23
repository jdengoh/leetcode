class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countArray = new int[26];                // char freq count
        char[] magArray = magazine.toCharArray();      // magazine char array
        char[] ransomArray = ransomNote.toCharArray(); // ransomNote char array

        System.out.println(Arrays.toString(countArray));
        System.out.println(Arrays.toString(magArray));
        System.out.println(Arrays.toString(ransomArray));
        
        for (char x: magArray) {
            countArray[x-'a']++;
        }
        
        System.out.println(Arrays.toString(countArray));

        for (char x: ransomArray) {
            countArray[x-'a']--;
            int abc = x-'a';
            if (countArray[x-'a'] < 0) return false;
        }

        return true;
    }

}