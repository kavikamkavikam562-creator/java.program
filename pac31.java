public class pac31{
public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34, 89}; // Example array

        // Initialize variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Not enough unique elements.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

