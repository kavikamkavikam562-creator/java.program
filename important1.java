import java.util.ArrayList;
import java.util.Collections;

class important1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        //list.remove(1);
        //list.set(0,12);

        System.out.println(list);

        ArrayList<Double> junk = new ArrayList<>();
        junk.add(3.14);
        junk.add(4.99);
        junk.add(8.99);


        System.out.println(junk);

        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("World");
        words.add("Exclusive");
        //words.set(0,"Earth");
        //System.out.println(words.get(1));
        //System.out.println(words.size());
        Collections.sort(words);
        System.out.print(words);
    }
}
