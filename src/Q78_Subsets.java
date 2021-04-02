import java.util.ArrayList;
import java.util.List;

/*
Given a set of characters represented by a String,
return a list containing all subsets of the characters.

Assumptions

There are no duplicate characters in the original set.
​Examples

Set = "abc", all the subsets are [“”, “a”, “ab”, “abc”, “ac”, “b”, “bc”, “c”]
Set = "", all the subsets are [""]
Set = null, all the subsets are []
 */
public class Q78_Subsets {
    public List<String> subsets(String set){
        List<String> result = new ArrayList<>();
        if (set == null){
            return result;
        }
        char[] arraySet = set.toCharArray();
        //record the current subset
        StringBuilder sb = new StringBuilder();
        helper(arraySet, sb, 0, result);
        return result;
    }

    private void helper(char[] set, StringBuilder sb, int index, List<String> result){
        //terminate condition: when finish determining for all characters pick or not, we have a complete subset
        if (index == set.length){
            result.add(sb.toString());
            return;
        }
        //1. not pick up the character at index
        helper(set, sb, index + 1, result);
        //2. pick up the character at index
        sb.append(set[index]);
        helper(set, sb, index + 1, result);
        sb.deleteCharAt(sb.length() - 1); //remember to remove the added character when backtracking to previous level
    }

    public static void main(String[] args){
        Q78_Subsets s = new Q78_Subsets();
        String a = "abc";
        List<String> result = s.subsets(a);
        System.out.println(result);

    }
}
