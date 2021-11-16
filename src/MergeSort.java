public class MergeSort {

    public int[] mergeSort(int[] array) {

        if(array.length < 2) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        //If there is 8 elements, 4 will be the half of length, so we go from 0 to 3 in that case
        //And fill left array with main array values on those positions
        for(int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        //We start from the mid '4' to the last element of the array
        for(int j = mid; j < array.length; j++) {
            //j - mid because mid is 4, so we subtract 4 so the new array will start from 0 to 3
            right[j - mid] = array[j];
        }

        //We call recursive functions to separate the arrays until there is only one element
        mergeSort(left);
        mergeSort(right);

        //When we have at least a pair of elements in an array, we use merge to concatenate those arrays in a sorted way
        //We pass the left array, the right array and the array where we want to put them
        merge(left, right, array);

        return array;
    }

    public int[] merge(int[] left, int[] right, int[] array) {

        //We get length of both arrays, left and right
        int ll = left.length;
        int rl = right.length;

        //This will be our counters from left, right and result array
        int l = 0;
        int r = 0;
        int a = 0;

        //We loop until one of the sides is empty
        while(l < ll && r < rl) {

            //We check which one is greater so we can put the lesser one in the array
            //and +1 their counter
            if(left[l] > right[r]) {
                array[a] = right[r];
                r++;
            } else if (right[r] > left[l]) {
                array[a] = left[l];
                l++;
            }

            //Since 'a' is the index of the array where we want to store the minimum
            //And since we already put the minimum above in 'a' index, we +1 so we can go
            //for the second element in array
            a++;
        }

        //In case right is empty, we store all the left array into result array
        while(l < ll) {
            array[a] = left[l];
            a++;
            l++;
        }

        //Same but now with left
        while(r < rl) {
            array[a] = right[r];
            a++;
            r++;
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
