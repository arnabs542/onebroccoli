/*
Given an original string input, and two strings S and T,
from left to right replace all occurrences of S in input with T.

Assumptions

input, S and T are not null, S is not empty string
Examples

input = "appledogapple", S = "apple", T = "cat", input becomes "catdogcat"
input = "laicode", S = "code", T = "offer", input becomes "laioffer"
注意： replace的string有可能短，也有可能长！
 */
public class StringReplace {
    //Method 1: not using any String/StringBuilder utility, using char[] to do it inplace
    public String replaceI(String input, String s1, String s2){
        //Assumption: input, s1, s2 are not null, s1 is not empty
        char[] array = input.toCharArray();
        if (s1.length() >= s2.length()){
            return replaceShorter(array, s1, s2);
        }
        return replaceLonger(array, s1, s2);
    }

    //handle s1>=s2
    public String replaceShorter(char[] input, String s1, String s2){
        //we use input char array since the number of characters needed is less
        //fast and slow pointers both from left to right direction
        int slow = 0;
        int fast = 0;
        while (fast < input.length){
            //when we find a match of s1 on the substring starting from the fast pointer
            //copy the s2 at slow pointer
            if (fast <= input.length - s1.length() && equalSubstring(input, fast, s1)){
                copySubstring(input, slow, s2);
                slow += s2.length();
                fast += s1.length();
            } else {
                input[slow] = input[fast];
                slow++;
                fast++;
            }
        }
        return new String(input, 0, slow);



    }

    //handle s1<s2

    //check if the substring from fromIndex is the same as s1
    private boolean equalSubstring(char[] input, int fromIndex, String s){
        for (int i = 0; i < s.length(); i++){
            if (input[fromIndex + i] != s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //copy string s2 to result at fromIndex
    private void copySubstring(char[] result, int fromIndex, String s2){
        for (int i = 0; i < s2.length(); i++){
            result[fromIndex + i] = s2.charAt(i);
        }
    }
}
