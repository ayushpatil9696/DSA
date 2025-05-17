class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character>charSet = new HashSet<>();
        // using hashset, it store unique value unlike the hashMap 


        for (int right = 0; right < s.length(); right++){
            //ittirating through the s string 
            while (charSet.contains(s.charAt(right))) { // while hashset contains the character of the right pointer
                charSet.remove(s.charAt(left)); // we remove the character at left pointer 
                left++; // and move the left pointer
            }

            charSet.add(s.charAt(right)); // then add the right pointer character in the hashset
            maxLength = Math.max(maxLength, right - left + 1); // right p - left p to find the length and +1 
            // since our s array starts from 0 
        }
        
        return maxLength;
    }
}