class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int wordsS [] = new int[26];
        int wordsT [] = new int[26];
        for(int i = 0; i<s.length();i++){
            wordsS[(int) s.charAt(i)-97]++;
            wordsT[(int) t.charAt(i)-97]++;
        }
        return Arrays.equals(wordsS,wordsT);
    } 
}
