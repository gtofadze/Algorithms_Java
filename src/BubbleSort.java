public static void bubbleSort(int[] arr) {

    boolean neededSwap = true;
    int edge = arr.length - 1;

    while (neededSwap) {
        neededSwap = false;
        for (int i = 0; i < edge; i++) {
            if (arr[i] > arr[i + 1]) {
                int holder = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = holder;
                neededSwap = true;
            }
        }
        edge--;
    }
}

void main() {

    int[] arr_a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr_b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] arr_c = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    int[] arr_d = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
    int[] arr_e = {0, -5, 12, 3, -1, 0, 8, -10, 4, 2};

    bubbleSort(arr_a);
    bubbleSort(arr_b);
    bubbleSort(arr_c);
    bubbleSort(arr_d);
    bubbleSort(arr_e);

    IO.println(Arrays.toString(arr_a));
    IO.println(Arrays.toString(arr_b));
    IO.println(Arrays.toString(arr_c));
    IO.println(Arrays.toString(arr_d));
    IO.println(Arrays.toString(arr_e));
}