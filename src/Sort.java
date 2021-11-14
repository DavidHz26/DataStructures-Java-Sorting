

public class Sort {

    public Sort() {

    }

    public int[] bubbleSort(int[] array) {


        for(int i = 0; i < array.length; i++) {

            //For each i iteration, inside loop will be decreasing the times we need to traverse
            //So the greater number in array of first iteration remains at the last position of array
            for(int j = 0; j < array.length - i - 1; j++) {

                //We compare if the next number is lesser
                if(array[j] > array[j + 1]) {

                    //If it is, we swap their values
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j +1 ] = tmp;
                }
            }
        }

        return array;
    }

    public int[] selectionSort(int[] array) {

        //We traverse all the array
        for(int i = 0; i < array.length - 1; i++) {

            //iMin will be increasing the sorted part and decreasing the unsorted part
            //as well as getting the index of the first element of the unsorted part where we
            //are going to store the minimum number in array
            int iMin = i;

            //We start from i + 1 to not repeat the iMin (index of minimum number), just
            // the ones next to it
            for(int j = i + 1; j < array.length; j++) {

                //We check if there is a lesser number in the array that
                // array[iMin]
                if(array[j] < array[iMin]) {

                    //If there is one, we point index of minimum to this number
                    iMin = j;
                }
            }

            //Before increasing the sorted part and decreasing the unsorted part
            //We check if index of minimum is still pointing to first element in array
            if(iMin != i) {

                //If not then we found a lesser number, so we swap the values to let
                //first element of array as the minimum
                int temp = array[i];
                array[i] = array[iMin];
                array[iMin] = temp;
            }
        }

        return array;
    }

    public int[] insertionSort(int[] array) {


        return array;
    }

    public void printArray(int[] array) {
        for(int i : array) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
    }
}
