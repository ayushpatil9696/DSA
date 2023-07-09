class anagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    

    int[] store = new int[26];

    for (int i = 0; i < s.length(); i++) {
        store[ch - 'a']++;
    }

    for (int i = 0; i<t.length() i++){
        store[ch - 'a']--;
    }

    for (int count:store){
        if(count !=0){
            return false;
        }
    }
}
