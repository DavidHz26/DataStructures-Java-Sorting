public class Practice {
    public static void main(String[] args) {
        int[] array = {30, 10, 50, 20, 60, 40};

        //bubble(array);

        //selection(array);

        insertion(array);

        printArr(array);
    }

    public static void bubble(int[] array) {
        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array.length - i - 1; j++) {

                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selection(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int indexMin = i;

            for(int j = i + 1; j < array.length; j++) {

                if(array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }

            if(indexMin != i) {
                int temp = array[indexMin];
                array[indexMin] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertion(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int current = array[i];

            int j = i - 1;

            while(j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }

    public static void printArr(int[] array) {
        for(int i : array) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
    }
}
