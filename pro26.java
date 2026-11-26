import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char x = st.pop();

                if ((c == ')' && x != '(') ||
                    (c == '}' && x != '{') ||
                    (c == ']' && x != '[')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        System.out.println(st.isEmpty() ? "Balanced" : "Not Balanced");
    }
}