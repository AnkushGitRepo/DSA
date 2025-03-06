import java.util.*;
class FirstNegativeInEveryWindowOfSizeK{
    // Time complexity: O(n)
    // Space complexity: O(k)
    // Approach: Sliding window
    // 1. Traverse the array from 0 to k-1 and add the negative integers to the result list
    // 2. Traverse the array from k to n-1
    // 3. If the integer at i is negative, add it to the result list
    // 4. Add the first element of the result list to the result list
    // 5. Return the result list
    // Note: The result list stores the first negative integer in every window of size k

    public static List<Integer> FirstNegativeInteger(int [] arr, int k){

        // List to store the first negative integer in every window of size k
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse the array from 0 to k-1 and add the negative integers to the result list
        int i = 0;
        while ( i < k ){
            if (arr[i] < 0) result.add(arr[i]);
            i++;
        }

        // Traverse the array from k to n-1
        while ( i < arr.length ){
            // If the integer at i is negative, add it to the result list
            if ( arr[i] < 0 ) result.add(arr[i]);

            // Add the first element of the result list to the result list
            result.add(result.getFirst());
            i++;
        }

        // Return the result list
        return result;
    }


    public static void main(String[] args) {
        int [] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        printArrayAndK(arr,k);
        System.out.println(FirstNegativeInteger(arr, k));

        arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        k = 2;
        printArrayAndK(arr,k);
        System.out.println(FirstNegativeInteger(arr, k));

        arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        k = 4;
        printArrayAndK(arr,k);
        System.out.println(FirstNegativeInteger(arr, k));

        arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        k = 5;
        printArrayAndK(arr,k);
        System.out.println(FirstNegativeInteger(arr, k));

        arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        k = 6;
        printArrayAndK(arr,k);
        System.out.println(FirstNegativeInteger(arr, k));

        arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        k = 7;
        printArrayAndK(arr,k);
        System.out.println(FirstNegativeInteger(arr, k));
    }


    public static void printArrayAndK(int [] arr, int k){
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("k: " + k);
    }
}