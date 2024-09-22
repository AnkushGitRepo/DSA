import java.util.Arrays;
import java.util.Scanner;

class MiscProblems{
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        int arr[] = {13,46,24,52,20,9,9,9,9,20};
        int [] sortedArray = selectionSort(arr);
        print(sortedArray);
        int[] reversedArray = reverseArray(arr);
        print(reversedArray);
        int [] rotatedArray = rotate(sortedArray, 2001);
        print(rotatedArray);
        print(reverseWithSpace(sortedArray, 2000));
        int [] frequencyArray = freqArraySearch(arr);
//        System.out.print("Enter Number of Times You Want To Search: ");
//        int times = newObj.nextInt();
//        for (int i = 1; i <= times; i++){
//            System.out.print("Enter the number you want to search: ");
//            int numb = newObj.nextInt();
//            System.out.println("Number of Times Appear In Array: "+ frequencyArray[numb]);
//        }

        int [] arr1 = {0,1,0,1,1,0,1,1,0,0};
        sortArray(arr1);
        print(arr1);

        int [] arr2 = {0,1,2,3,4,5,6,7,8,9,10};
        //evenOddSort(arr2);
        print(arr2);

        int [] arr3 = {-7,-3,0,1,2,3,4,5,6,7};
        int [] result = squareSort(arr3);
        Arrays.sort(result);
        print(result);

        int [] arr4 = {0,1,2,3,4,5,6,7,8,9,10};
        prefixSum(arr4);
        print(arr4);

        int l = 2;
        int r = 5;
        System.out.println(arr4[r]);
        System.out.println(arr4[l-1]);
        int prefixSum = arr4[r] - arr4[l-1];
        System.out.println(prefixSum);

        int [] arr5 = {2,3,4,5,6,7,8,9,10};
        System.out.println(equalSumPartition(arr5));

        // false condition
        int [] arr6 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(equalSumPartition(arr6));

    }



    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] selectionSort(int [] arr){
        for (int i = 0; i <= arr.length - 2; i++){
            int min = i;
            for(int j = i; j <= arr.length - 1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] reverseArray(int arr[]){
        int[] resultArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            resultArray[j++] = arr[i];
        }
        return resultArray;
    }

    public static int[] rotate(int arr[] , int k){
        k = k % arr.length;
        int j = 0;
        int [] result = new int[arr.length];
        for(int i = arr.length - k; i <= arr.length - 1; i++){
            result[j++] = arr[i];
        }
        for(int i = 0; i < arr.length - k; i++){
            result[j++] = arr[i];
        }
        return result;
    }

    public static void swap(int [] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void reverse(int [] arr, int i, int j){
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static int[] reverseWithSpace(int []arr , int k){
       int n = arr.length;
       k = k % n;
       reverse(arr,0,n-k-1);
       reverse(arr, n-k, n-1);
       reverse(arr, 0, n- 1);
       return arr;
    }

    public static int[] freqArraySearch(int [] arr){
        int [] freq = new int[100];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]] += 1;
         }
        return freq;
    }


    // Sort an array consisting of only 0s and 1s
    public static void sortArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > i; j-- ){
                if(arr[i] == 0 && arr[j] == 1){
                    continue;
                }else{
                    swap(arr,i,j);
                }
            }
        }
    }

    // Sort an array in such a way that all the even numbers come before the odd numbers
    public static void evenOddSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                    continue;
                } else {
                    swap(arr, i, j);
                }
            }
        }
    }

    // For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order
    public static int [] squareSort(int [] arr){
        int result[] = new int[arr.length];
        int x = 0;
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[x++] = Math.abs(arr[i]) * Math.abs(arr[i]);
                i++;
            }else{
                result[x++] = Math.abs(arr[j]) * Math.abs(arr[j]);
                j--;
            }
        }
        return result;
    }

    public static void prefixSum(int [] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static int totalSumOfArray(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static boolean equalSumPartition (int arr[]){
        int totalSum = totalSumOfArray(arr);
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum -prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
    }

}