import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public int[] bucketSort(int[] array) {

        //Nightmare...

        int numberOfBuckets = (int) Math.ceil(Math.sqrt(array.length));

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets + 1];

        for(int i =0;i<buckets.length;i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        int max = maxValue(array);

        for(int i : array) {
            int bucketId = (int) Math.ceil((i * numberOfBuckets) / max);
            buckets[bucketId].add(i);
        }

        for(int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        for(int i = 1; i < buckets.length; i++) {
            buckets[0].addAll(buckets[i]);
        }

        int[] result = new int[buckets[0].size()];

        for(int i = 0; i < result.length; i++) {
            result[i] = buckets[0].get(i);
        }

        return result;

    }

    public int maxValue(int[] array) {
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public void printArray(int[] array) {
        for(int i : array) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
    }

}
