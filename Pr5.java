import java.util.Scanner;

public class QuickSort {

    // Partition function
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort function
    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Generate random numbers using Math.random()
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }

        System.out.println("\nArray before sorting:");
        for (int i = 0; i < Math.min(n, 20); i++) {
            System.out.print(arr[i] + " ");
        }

        // Start time
        long startTime = System.nanoTime();

        quickSort(arr, 0, n - 1);

        // End time
        long endTime = System.nanoTime();

        System.out.println("\n\nArray after sorting:");
        for (int i = 0; i < Math.min(n, 20); i++) {
            System.out.print(arr[i] + " ");
        }

        long executionTime = endTime - startTime;

        System.out.println("\n\nExecution Time: " + executionTime + " nanoseconds");

        sc.close();
    }
              }
