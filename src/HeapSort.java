public static void HeapSort(int[] arr) {
	int len = arr.length;
	int lastParent = len / 2 - 1;
	
	for (int i = lastParent; i >= 0; i--) {
		heapify(arr, i, len);
	}

	for (int i = len - 1; i > 0; i--) {
		int holder = arr[0];
		arr[0] = arr[i];
		arr[i] = holder;

		heapify(arr,0, i);
	}
}

public static void heapify(int[] arr, int i, int len) {
	int left = i * 2 + 1;
	int right = i * 2 + 2;
	int largest = i;
	
	if (right < len && arr[right] > arr[largest]) {
		largest = right;
	}

	if (left < len && arr[left] > arr[largest]) {
		largest = left;
	}

	if (largest != i) {
		int holder = arr[largest];
		arr[largest] = arr[i];
		arr[i] = holder;

		heapify(arr, largest, len);
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