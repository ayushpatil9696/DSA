class anagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] store = new int[26];

    for (char ch : t.toCharArray()) {
      store[ch - 'a']++;
    }

    for (char ch : s.toCharArray()) {
      store[ch - 'a']--;
    }

    for (int count : store) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }
}
