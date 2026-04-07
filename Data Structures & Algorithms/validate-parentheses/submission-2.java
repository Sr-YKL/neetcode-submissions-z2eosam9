class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        Map<Character,Character> openToClose = new HashMap<>();
        openToClose.put(')','(');
        openToClose.put('}','{');
        openToClose.put(']','[');
        for(char character : s.toCharArray()){
            if(openToClose.containsKey(character)){
                if (!stack.isEmpty() && openToClose.get(character) == stack.peekFirst()){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
