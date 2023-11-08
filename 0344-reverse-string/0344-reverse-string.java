class Solution {
    public void reverseString(char[] s) {
        int length = s.length;

        //we define multiple integers in one condition 
        for(int i = 0, j = length-1; i <length/2; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        
    }
}