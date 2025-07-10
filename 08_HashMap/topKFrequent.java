import java.util.*;

class Main {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min-heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest frequency
            }
        }

        // Step 3: Extract top k elements
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Optional: Reverse to show highest frequency first
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        List<Integer> topK = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topK);
    }
}
