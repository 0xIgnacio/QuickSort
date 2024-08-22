public class QuickSort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // índice del elemento más pequeño

        for (int j = low; j < high; j++)
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }

        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);

            // Ordenar recursivamente los elementos antes y después de la partición
            quicksort(arr, low, part - 1);
            quicksort(arr, part + 1, high);
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 8, 9, 25, 3};
        System.out.println("Array original:");
        printArray(arr);

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Array ordenado:");
        printArray(arr);
    }
}
