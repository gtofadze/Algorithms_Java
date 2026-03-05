public static void SelectionSort(int[] arr) {

    int len = arr.length;

    for (int i = 0; i < (len - 1); i++) {
	int min = i;
        for (int j = i + 1;  j < len; j++) {
		if (arr[j] < arr[i]) {
			min = j;
            	}
	int holder = arr[min];
	arr[min] = arr[i];
	arr[i] = arr[min];
        }
    }
}

void main() {

    int[] arr_a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr_b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] arr_c = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    int[] arr_d = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
    int[] arr_e = {0, -5, 12, 3, -1, 0, 8, -10, 4, 2};

    SelectionSort(arr_a);
    SelectionSort(arr_b);
    SelectionSort(arr_c);
    SelectionSort(arr_d);
    SelectionSort(arr_e);

    IO.println(Arrays.toString(arr_a));
    IO.println(Arrays.toString(arr_b));
    IO.println(Arrays.toString(arr_c));
    IO.println(Arrays.toString(arr_d));
    IO.println(Arrays.toString(arr_e));
}