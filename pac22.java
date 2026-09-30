import java.util.*;

class pac22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while(sc.hasNextInt()) {   
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
}