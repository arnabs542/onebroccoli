/*
73. Combinations Of Coins
Given a number of different denominations of coins
(e.g., 1 cent, 5 cents, 10 cents, 25 cents),
get all the possible ways to pay a target number of cents.

Arguments

coins - an array of positive integers representing the different denominations of coins, there are no duplicate numbers and the numbers are sorted by descending order, eg. {25, 10, 5, 2, 1}
target - a non-negative integer representing the target number of cents, eg. 99
 */

/*
each combination is represented as a List<Integer> cur.
cur.get(i) = number of coins of coins[i]
all the combinations are stored in the result as List of List<Integer>
 */
public class CombinationOfCoins {
    public List<List<Integer>> combinations(int target, int[] coins) }
