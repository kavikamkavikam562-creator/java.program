public class pac27 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}

