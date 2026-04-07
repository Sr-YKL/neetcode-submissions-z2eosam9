class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int j = s.length()-1;
        for(int i=0; i <= j; i++){
            char initialChar = s.charAt(i);
            char finalChar = s.charAt(j);
            if (!Character.isLetterOrDigit(initialChar)){
                continue;  
            };
            if (!Character.isLetterOrDigit(finalChar)){
                j--;
                i--;
                continue;  
            };
            System.out.println(initialChar + " i: "+i );
            System.out.println(finalChar+ " j: "+j);
            if (initialChar != finalChar) return false;
            j--;
        }
        return true;
    }
}
