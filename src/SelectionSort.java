public class SelectionSort {


    public int[] selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {

            int iMin = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[iMin]) {
                    iMin = j;
                }
            }

            if(iMin != i) {
                int temp = array[i];
                array[i] = array[iMin];
                array[iMin] = temp;
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
