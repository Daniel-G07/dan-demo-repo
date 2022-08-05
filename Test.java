import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("push test ");
        int[] myNums = {1,1,1,1,2,2,3,3,3,3,5,5,5,5,5,5,5,7,7,7};
        int[] topK = topKelements(myNums, 2);
        System.out.println(Arrays.toString(topK));
    }

    public static int[] topKelements(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}