public class QuickSort {

    public int[] quickSort(int[] array, int start, int end) {

        if (start >= end) {
            return array;
        }

        int pI = start;
        int pivot = end;

        for(int i = start; i < end; i++) {
            if(array[i] < array[pivot]) {
                int temp = array[i];
                array[i] = array[pI];
                array[pI] = temp;
                pI++;
            }
        }

        int temp = array[pI];
        array[pI] = array[pivot];
        array[pivot] = temp;

        System.out.println("start: " + start + " end: " + end);

        quickSort(array, start, pI - 1);
        quickSort(array, pI + 1, end);

        return array;

    }

    public void printArray(int[] array) {
        for(int i : array) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
    }


}
