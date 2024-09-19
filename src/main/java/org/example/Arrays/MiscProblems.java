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
        System.out.print("Enter Number of Times You Want To Search: ");
        int times = newObj.nextInt();
        for (int i = 1; i <= times; i++){
            System.out.print("Enter the number you want to search: ");
            int numb = newObj.nextInt();
            System.out.println("Number of Times Appear In Array: "+ frequencyArray[numb]);
        }
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
        int [] freq = new int[10000];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]] += 1;
         }
        return freq;
    }

}