public class pac7 {
    public static void main(String[] args) {

        int[][] table = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < table.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
                rowSum += table[i][j];
            }

            System.out.println("| " + rowSum);
        }
    }
}