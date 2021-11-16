public class InsertionSort {

    public int[] insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++) {

            int current = array[i];

            int j = i - 1;

            while(j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;

        }

        return array;
    }

    public void printArray(int[] array) {
        for(int i : array) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
    }
}
