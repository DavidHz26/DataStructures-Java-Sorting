public class Main {
    public static void main(String[] args) {

        int[] array = {30, 10, 50, 20, 60, 40};

        Sort sort = new Sort();

        System.out.println("BubbleSort");
        sort.bubbleSort(array);
        sort.printArray(array);
        System.out.println();

        System.out.println("SelectionSort");
        sort.selectionSort(array);
        sort.printArray(array);
        System.out.println();



    }
}
