import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextChar();

        // Create array and take input
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take the key to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Linear search
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
