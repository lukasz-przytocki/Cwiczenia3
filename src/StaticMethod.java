import java.util.Arrays;
import java.util.Random;

public class StaticMethod {
    public static void main(String[] args) {


        int[] table = {1,2,3,4,5,6};
        int[] table1 = new int[10];
        int[] table2 = {1,2,3,3,4,4,5,6,7,8,4 };
        System.out.println(Arrays.toString(reverseTable(table)));
        System.out.println(Arrays.toString(fillTable(table1)));
        System.out.println((occurrences(table2,4)));


    }
    final static int MAX = 10;

    static int[] reverseTable( int[] table){
        int[] tableRev = new int[table.length];
        for (int i = 0; i <table.length ; i++) {
            tableRev[table.length-1-i]=table[i];
        }
        return tableRev;
    }

    static int[] fillTable(int[] table){

        Random random = new Random();
        for (int i = 0; i <table.length ; i++) {
            table[i] = random.nextInt(StaticMethod.MAX);
        }
        return table;
    }

    static int occurrences(int[] table, int value){
        int counter=0;

        for (int i = 0; i <table.length ; i++) {
            if (table[i] == value){
                counter+=1;
            }
        }
        return counter;
    }



}
