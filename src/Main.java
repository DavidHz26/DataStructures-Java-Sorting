public class Main {
    public static void main(String[] args) {

        int[] array = {30, 10, 50, 20, 60, 40};
        //int[] array = {7, 1, 3, 5, 2, 6, 4};

//        System.out.println("BubbleSort");
//        BubbleSort bbs = new BubbleSort();
//        array = bbs.bubbleSort(array);
//        bbs.printArray(array);
//        System.out.println();
//
//        System.out.println("SelectionSort");
//        SelectionSort ss = new SelectionSort();
//        array = ss.selectionSort(array);
//        ss.printArray(array);
//        System.out.println();
//
//        System.out.println("InsertionSort");
//        InsertionSort is = new InsertionSort();
//        array = is.insertionSort(array);
//        is.printArray(array);
//        System.out.println();
//
//        System.out.println("BucketSort");
//        BucketSort bs = new BucketSort();
//        array = bs.bucketSort(array);
//        bs.printArray(array);
//        System.out.println();
//
//        System.out.println("MergeSort");
//        MergeSort ms = new MergeSort();
//        array = ms.mergeSort(array);
//        ms.printArray(array);
//
//        System.out.println("QuickSort");
//        QuickSort qs = new QuickSort();
//        array = qs.quickSort(array, 0, array.length - 1);
//        qs.printArray(array);


        System.out.println("HeapSort");
        HeapSort hs = new HeapSort(array.length);
        hs.printArray(array);
        array = hs.sort(array);
        hs.printArray(array);


    }
}
