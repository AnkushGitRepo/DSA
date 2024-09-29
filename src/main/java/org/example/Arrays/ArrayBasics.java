import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr;
        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = newObj.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = newObj.nextInt();
        }

        System.out.print("Original Array: ");
        print(arr);

        int[] copyArray = copyArray(arr);
        System.out.print("Copy Array: ");
        // copyArray[3] = 100;
        print(copyArray);

//        System.out.println("1. Frequency Of Element Question.");
//        System.out.print("Enter Value for Search: ");
//        int value = newObj.nextInt();
//        System.out.println("Value Occur In Array : "+freqOfElement(arr,value)+ " Times");
//        System.out.println();
//        System.out.println();

//        System.out.println("2. Frequency Of Element Question.");
//        System.out.print("Enter Value for Last Occurrence: ");
//        int lastOccurrence = newObj.nextInt();
//        System.out.println("Value Occur In Array : "+lastOccurrenceOfElement(arr,lastOccurrence)+ " At Last Time");
//        System.out.println();
//        System.out.println();

//        System.out.println("3. Strictly Greater Element Question.");
//        System.out.print("Enter Value: ");
//        int num = newObj.nextInt();
//        System.out.println("Number of Strictly Greater Value : "+numberOfStrictlyGreaterValue(arr,num));
//        System.out.println();
//        System.out.println();

        System.out.println("Is Sorted : " + isSorted(arr));

        System.out.println("Smallest And Largest Element: ");
        print(smallestAndLargestElementInArray(arr));

        System.out.println("Second Maximum Element: ");
        System.out.println(secondMaximum(arr));
        


    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] copyArray(int[] arr) {
        int[] copyArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
        return copyArray;
    }

    public static int freqOfElement(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    public static int lastOccurrenceOfElement(int[] arr, int value) {
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count = i;
            }
        }
        return count;
    }

    public static int numberOfStrictlyGreaterValue(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static int[] smallestAndLargestElementInArray(int arr[]) {
        Arrays.sort(arr);
        return new int[]{arr[2], arr[arr.length - 1]};
    }

    public static int secondMaximum(int [] arr){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Remove Duplicates
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}