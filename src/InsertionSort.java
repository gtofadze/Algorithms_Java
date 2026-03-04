public static void insertionSort(int[] arr) {

    int maxIndex = arr.length - 1;

    for (int edge = 0; edge < maxIndex - 1; edge++) {

        int keyIndex = edge + 1;
        int keyValue = arr[keyIndex];
        int j = edge;

        while (j >= 0 && arr[j] > keyValue) {
            arr[j + 1] = arr[j];
            j -= 1;
        }
        arr[j + 1] = keyValue;
    }
}

void main() {

    int[] arr_a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr_b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] arr_c = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    int[] arr_d = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
    int[] arr_e = {0, -5, 12, 3, -1, 0, 8, -10, 4, 2};

    insertionSort(arr_a);
    insertionSort(arr_b);
    insertionSort(arr_c);
    insertionSort(arr_d);
    insertionSort(arr_e);

    IO.println(Arrays.toString(arr_a));
    IO.println(Arrays.toString(arr_b));
    IO.println(Arrays.toString(arr_c));
    IO.println(Arrays.toString(arr_d));
    IO.println(Arrays.toString(arr_e));
}