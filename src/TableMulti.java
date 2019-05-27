public class TableMulti {
    public static void main(String[] args) {


        int[][] table = new int[4][];

        table[0] = new int[3];
        table[1] = new int[2];
        table[2] = new int[4];
        table[3] = new int[1];

        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;

        table[1][0] = 4;
        table[1][1] = 5;

        table[2][0] = 6;
        table[2][1] = 7;
        table[2][2] = 8;
        table[2][3] = 9;

        table[3][0] = 10;

        System.out.println("Suma pierwszych liczb wiersza wynosi: " +
                (table[0][0]+table[1][0]+table[2][0]+table[3][0]));



    }
}