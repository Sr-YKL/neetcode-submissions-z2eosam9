class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> indexes = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            System.out.println(word);
            int[] anagram = new int[26]; 
            for(int p = 0; p < word.length(); p++){
                anagram[word.charAt(p) - 'a']++;
            }
            String index = Arrays.toString(anagram);
            System.out.println(index);

            indexes.putIfAbsent(index, new ArrayList<>());
            indexes.get(index).add(word);
        }
        return new ArrayList<>(indexes.values());
    }
}
