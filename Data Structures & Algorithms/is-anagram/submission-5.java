class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int words [] = new int[26];
        for(int i = 0; i<s.length();i++){
            words[(int) s.charAt(i)-97]++;
            words[(int) t.charAt(i)-97]--;
        }
        for (int n : words) if (n != 0) return false;
        
        return true;
    } 
}
