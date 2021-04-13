import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
laicode
272. Combinations For Telephone Pad I
Given a telephone keypad, and an int number, print all words which are possible by pressing these numbers, the output strings should be sorted.

{0 : "", 1 : "", 2 : "abc", 3 : "def", 4 : "ghi", 5 : "jkl", 6 : "mno", 7 : "pqrs", 8 : "tuv", 9 : "wxyz"}

Assumptions:

The given number >= 0
Examples:

if input number is 231, possible words which can be formed are:

[ad, ae, af, bd, be, bf, cd, ce, cf]
 */
public class CombinationTelephonePadI {
    public String[] combinations(int number){
        List<String> result = new ArrayList<String>();
        String[] numToChar = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb = new StringBuilder();
        helper(Integer.toString(number).toCharArray(), numToChar, 0, sb, result);
        return result.toArray(new String[0]);
    }
    //method 1
    private void helper(char[] number, String[] numToChar, int level, StringBuilder sb, List<String> result){
        if (level == number.length){
            result.add(sb.toString());
            return;
        }
        String a = numToChar[number[level] - '0']; //为什么要减'0'?
        char[] chars = numToChar[number[level] - '0'].toCharArray();
        if (chars.length == 0){
            helper(number, numToChar, level + 1, sb, result);
        } else {
            for (int i = 0; i < chars.length; ++i){
                helper(number, numToChar, level + 1, sb.append(chars[i]), result);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
    public static void main(String[] args){
        CombinationTelephonePadI s = new CombinationTelephonePadI();
        String[] result = s.combinations(213);
        System.out.println(Arrays.toString(result));
    }
}
