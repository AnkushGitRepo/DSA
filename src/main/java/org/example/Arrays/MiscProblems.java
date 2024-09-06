
class MiscProblems{
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int [] sortedArray = selectionSort(arr);
        print(sortedArray);
    }

    public static int[] reverseArray(int [] arr){
        int j = 0;
        int [] reversedArray = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
                reversedArray[j++] = arr[i];
        }
        return reversedArray;
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
}