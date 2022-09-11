import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HashTableSumOfTwoNumbers {
    // create a method that implements HashTable to return all the pairs of numbers that add up to the target sum
    // return the pairs in a List
    public List<Integer[]> twoNumberSum(int[] array, int targetSum) {
        List<Integer[]> pairs = new ArrayList<Integer[]>();
        Hashtable<Integer, Boolean> nums = new Hashtable<Integer, Boolean>();
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (nums.containsKey(potentialMatch)) {
                Integer[] pair = {num, potentialMatch};
                pairs.add(pair);
            } else {
                nums.put(num, true);
            }
        }
        return pairs;
    }

    // not a fast approach!
    public List<Integer[]> twoNumberSum2(int[] array, int targetSum) {
        List<Integer[]> pairs = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    Integer[] pair = {firstNum, secondNum};
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }
}
