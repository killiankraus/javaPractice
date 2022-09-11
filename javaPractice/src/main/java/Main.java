import LinkedList.SinglyLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HashTableSumOfTwoNumbers hashTableSumOfTwoNumbers = new HashTableSumOfTwoNumbers();

        long start = System.currentTimeMillis();;

        // create random array of size 10000000
        // create a random number from 1 to 99 and add it to the array

        int [] arr2 = new int[30000000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 99 + 1);
        }

        List<Integer[]> pairs = hashTableSumOfTwoNumbers.twoNumberSum(arr2, 10);
        for (Integer[] pair : pairs) {
            System.out.println("{" + pair[0] + " , " + pair[1] + "}");
        }
        System.out.println(System.currentTimeMillis() - start + " ms");
    }
}
