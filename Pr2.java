import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n) {

        int temp;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        bubbleSort(arr, n);

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
