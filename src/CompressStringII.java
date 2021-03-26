/*
String Encoding / compressing
Given a string, replace adjacent, repeated characters with the character
followed by the number of repeated occurrences.

Assumptions

The string is not null

The characters used in the original string are guaranteed to be ‘a’ - ‘z’

Examples

“abbcccdeee” → “a1b2c3d1e3”
 */
public class CompressStringII {
    public String compress(String input){
        if (input == null |input.length() == 0){
            return input;
        }
        char[] array = input.toCharArray();
        return encode(array);
    }

    private String encode(char[] input){
        //step 1: deal with the cases where the adjacent occurrence of the letters >= 2.
        int slow = 0;
        int fast = 0;
        int newLength = 0;
        //set begin pointer, move fast to the end of the same character
        while (fast < input.length){
            int begin = fast;
            while (fast < input.length && input[fast] == input[begin]){
                fast++;
            }
        }
        return new String(result);
    }


    public static void main (String[] args){
        CompressStringII s = new CompressStringII();
        String a = "abbcccdeee";
        String res = s.compress(a);
        System.out.println(res);
    }
}
