import java.util.PriorityQueue;

class LastStoneWeight{
    // Time complexity: O(n log n)
    // Space complexity: O(n)
    // Max heap approach
    // The idea is to use a max heap to store the stones in decreasing order of their weights.
    // We keep removing the two heaviest stones and smashing them together until there is only one stone left or no stones left.
    // If the two stones have the same weight, they are both destroyed. If they have different weights, the lighter stone is destroyed and the heavier stone's weight is reduced by the weight of the lighter stone.
    // Finally, we return the weight of the last remaining stone or 0 if there are no stones left.
    public static int lastStoneWeight(int[] stones) {
        //setting decreasing order of the heap or max heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b-a);

        // Adding all the stones to the max heap
        for(int each: stones)
            heap.add(each);

        // Smashing the stones together until there is only one stone left or no stones left
        while(heap.size()>1){
            int top1 = heap.poll();
            int top2 = heap.poll();
            int diff = Math.abs(top1-top2);

            // If the two stones have different weights, the lighter stone is destroyed and the heavier stone's weight is reduced by the weight of the lighter stone
            if(diff!=0){
                heap.add(diff);
            }
        }

        // If there is only one stone left, return its weight. If there are no stones left, return 0
        if(heap.size()!=0){
            return heap.poll();
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases to validate the solution
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1})); // Expected output: 1
        System.out.println(lastStoneWeight(new int[]{1})); // Expected output: 1
        System.out.println(lastStoneWeight(new int[]{})); // Expected output: 0
        System.out.println(lastStoneWeight(new int[]{3,7,2,5})); // Expected output: 1
        System.out.println(lastStoneWeight(new int[]{10,4,2,10})); // Expected output: 2
    }
}