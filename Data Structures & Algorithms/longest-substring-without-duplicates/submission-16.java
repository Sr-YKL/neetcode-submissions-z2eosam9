class Solution {
    public int lengthOfLongestSubstring(String s) {
        //minha Sliding Window
        int left = 0, answer = 0;
        Set<Integer> map = new HashSet<>();
        for(int right = 0; right <= s.length() -1; right++){
            int temp = (int) s.charAt(right);
            while(map.contains(temp)){
                System.out.println((int) s.charAt(left));
                map.remove((int) s.charAt(left));
                left++;
            }
            answer = Math.max(answer, right - left+1);
            map.add(temp);
        }
        
        return answer;
    }
}
