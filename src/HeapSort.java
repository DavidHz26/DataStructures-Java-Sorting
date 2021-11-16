public class HeapSort {

    private int[] array;
    private int sizeOfHeap;

    //A complete Nightmare to implement......

    public HeapSort(int size) {
        array = new int[size + 1];
        sizeOfHeap = 0;
    }

    public int[] sort(int[] toSort) {
        for(int i = 1; i < toSort.length + 1; i++) {
            insert(toSort[i - 1]);
        }

        int[] result = new int[toSort.length];

        for(int i = 0; i < toSort.length; i++) {
            result[i] = array[peek()];
            extractMin();
        }

        return result;
    }

    public int peek() {

        //Peek only returns 1 so I can use array[peek()] to refer to first element in heap
        if(sizeOfHeap == 0) {
            return -1;
        }

        return 1;
    }

    private void insert(int data) {
        //size of heap is 0, so in order to not use index 0 we +1
        array[sizeOfHeap + 1] = data;
        sizeOfHeap++;
        heapifyBottomToTop(sizeOfHeap);
    }

    public void extractMin() {
        if(sizeOfHeap <= 0) {
            return;
        }

        //first element is equal to last element
        array[peek()] = array[sizeOfHeap];
        //we clear the last space
        array[sizeOfHeap] = 0;
        //We reduce by 1 the size of the heap
        sizeOfHeap--;


        heapifyTopToBottom(peek());

    }

    public void heapifyBottomToTop(int index) {

        //We checj if the parent of array[index] is greater, to swap them if necessary
        int parent = index / 2;

        if (index <= 1) {
            return;
        }

        if (array[index] < array[parent]) {
            int tmp = array[index];
            array[index] = array[parent];
            array[parent] = tmp;
        }

        heapifyBottomToTop(parent);

    }

    public void heapifyTopToBottom(int index) {

        //We check from the root if the childs are lesser than index, to swap them if necessary

        int left  = index * 2;
        int right = index * 2 +1;
        int smallest = 0;

        //If last element index of the heap is lesser than left, then there is no left
        //child, and therefore, no right child, so we simply return
        if (sizeOfHeap < left || isEmpty()) {
            return;
        }

        //If last element index is pointing to left child, then there is only one child, so
        // check which one is lesser and swap them if necessary
        else if (sizeOfHeap == left) {
            if(array[index] > array[left]) {
                int tmp = array[index];
                array[index] = array[left];
                array[left] = tmp;
            }
            return;
        }

        else {
            //If both children are there we find the smaller one
            if(array[left] < array[right]) {
                smallest = left;
            }else {
                smallest = right;
            }

            //If Parent is greater than smaller child, then we swap them
            if(array[index] > array[smallest]) {
                int tmp = array[index];
                array[index] = array[smallest];
                array[smallest] = tmp;
            }
        }

        //And we keep doing this until there is no child left
        heapifyTopToBottom(smallest);
    }

    public Boolean isEmpty() {
        for(int i : array) {
            if(i != 0) {
                return false;
            }
        }

        return true;
    }

    public void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
