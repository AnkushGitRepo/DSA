import java.util.Arrays;
import java.util.Scanner;

class TwoSumAndThreeSum{
    public static void main(String[] args) {
        int [] arr;
        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = newObj.nextInt();
        arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = newObj.nextInt();
        }

        System.out.print("Original Array: ");
        print(arr);

//        System.out.println("Number of Pair Which Sum To The Target: " + twoSum(arr,7));
//        System.out.println("Three Sum: "+ threeSum(arr, 7));

        System.out.println("Max Number In Array Is : "+ findMax(arr));
        System.out.println("Min Number In Array Is : "+ findMin(arr));
        System.out.println("Second Max Number In Array Is : "+ secondMaximum(arr));
        System.out.println("Second Min Number In Array Is : "+ secondMinimum(arr));

    }

    // print
    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int twoSum(int [] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static int threeSum(int [] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int secondMaximum(int [] arr){
        int max = findMax(arr);
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        return findMax(arr);
    }

    public static int secondMinimum(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }



}