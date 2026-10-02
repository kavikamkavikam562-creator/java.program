import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] q = new int[k];
        int front = 0;
        int size = 0;

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equals("enQueue")) {
                int x = sc.nextInt();

                if (size == k) {
                    System.out.println("false");
                } else {
                    int rear = (front + size) % k;
                    q[rear] = x;
                    size++;
                    System.out.println("true");
                }

            } else if (op.equals("deQueue")) {

                if (size == 0) {
                    System.out.println("false");
                } else {
                    front = (front + 1) % k;
                    size--;
                    System.out.println("true");
                }

            } else if (op.equals("Front")) {

                if (size == 0)
                    System.out.println(-1);
                else
                    System.out.println(q[front]);

            } else if (op.equals("Rear")) {

                if (size == 0)
                    System.out.println(-1);
                else {
                    int rear = (front + size - 1) % k;
                    System.out.println(q[rear]);
                }

            } else if (op.equals("isEmpty")) {

                System.out.println(size == 0);

            } else if (op.equals("isFull")) {

                System.out.println(size == k);
            }
        }
    }
}
