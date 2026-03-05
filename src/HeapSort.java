public static void HeapSort(int[] arr) {
    // [1 2 3 4 5 6 7 8 9]
    int len = arr.length;

    for (int i = len; i > 1; i--) {
        toHeap(arr, i);
        int holder = arr[i-1];
        arr[i-1] = arr[0];
        arr[0] = holder;
    }
}

public static void toHeap(int[] arr, int size) {

    // if heap tree starts from 0:
    // last parent = i/2
    // right child = i*2 + 1
    // left child = i*2

    int last = size / 2;

    for (int i = last; i > 0; i--) {

        //comparing to right child
        if (i*2+1 <= size && arr[i*2] > arr[i-1]) {
            int holder = arr[i-1];
            arr[i-1] = arr[i*2];
            arr[i*2] = holder;
        }

        //comparing to left child
        if (arr[i*2-1] > arr[i-1]) {
            int holder = arr[i-1];
            arr[i-1] = arr[i*2];
            arr[i*2] = holder;
        }
    }
}

void main() {

    int[] arr_a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr_b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] arr_c = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    int[] arr_d = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
    int[] arr_e = {0, -5, 12, 3, -1, 0, 8, -10, 4, 2};

    HeapSort(arr_a);
    HeapSort(arr_b);
    HeapSort(arr_c);
    HeapSort(arr_d);
    HeapSort(arr_e);

    IO.println(Arrays.toString(arr_a));
    IO.println(Arrays.toString(arr_b));
    IO.println(Arrays.toString(arr_c));
    IO.println(Arrays.toString(arr_d));
    IO.println(Arrays.toString(arr_e));
}