public class pac29 {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
