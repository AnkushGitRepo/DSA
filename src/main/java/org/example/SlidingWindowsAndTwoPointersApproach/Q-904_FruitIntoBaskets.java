import java.util.HashMap;
import java.util.Map;

class FruitIntoBaskets{
    // Problem Question: https://leetcode.com/problems/fruit-into-baskets/
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Sliding Windows Approach
    public static int totalFruit(int[] fruits){

        // HashMap to store the fruits and their count
        Map<Integer, Integer> basket = new HashMap<>();

        // left pointer, right pointer and max count of fruits
        int left = 0, right = 0, max = 0;

        // Loop through the fruits array and keep track of the fruits in the basket
        for (right = 0; right < fruits.length; right++){

            // currentCount of the fruit in the basket and increment the count
            int currentCount = basket.getOrDefault(fruits[right], 0);
            basket.put(fruits[right], currentCount + 1);

            // If the size of the basket is greater than 2, then remove the fruits from the basket
            while ( basket.size() > 2){

                // count of the fruit in the basket and decrement the count of the fruit in the basket and increment the left pointer to remove the fruit from the basket
                int count = basket.get(fruits[left]);
                if (count == 1){
                    basket.remove(fruits[left]);
                } else {
                    basket.put(fruits[left], count - 1);
                }
                left++;
            }

            // Update the max count of the fruits in the basket by taking the maximum of the current max and the difference between the right and left pointer
            max = Math.max(max, right - left + 1);
        }

        // return the max count of the fruits in the basket
        return max;
    }

    public static void main(String[] args){
        int[] fruits = {1, 2, 1, 2, 3};
        printArray(fruits);
        System.out.println(totalFruit(fruits));

        int[] fruits2 = {0, 1, 2, 2};
        printArray(fruits2);
        System.out.println(totalFruit(fruits2));

        int[] fruits3 = {1, 2, 3, 2, 2};
        printArray(fruits3);
        System.out.println(totalFruit(fruits3));

        int[] fruits4 = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        printArray(fruits4);
        System.out.println(totalFruit(fruits4));

        int[] fruits5 = {1, 2, 3, 2, 2};
        printArray(fruits5);
        System.out.println(totalFruit(fruits5));
    }

    // Helper function to print array
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}