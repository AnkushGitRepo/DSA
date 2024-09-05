class MiscProblems{
    public static void main(String[] args) {
        int arr[] = {24,34,65,23,86};
        int [] reveredArr = reverseArray(arr);
        print(reveredArr);
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
}