public class BubbleSort {

    public int[] bubbleSort(int[] array) {


        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j +1 ] = tmp;
                }
            }
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
