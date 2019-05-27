import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class TwoDimensionalTableMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoDimensionalTable tableT = new TwoDimensionalTable();

        System.out.println("Podaj wielkość tablicy: ");
        int tableSize = scanner.nextInt();

        double table[] = new double[tableSize];

        int i;

        for (i = 0; i < tableSize; i++) {
            System.out.printf("Podaj wartość: ");
            table[i] = Double.valueOf(scanner.nextInt());
        }

        System.out.println(Arrays.toString(table));

        System.out.println("Kwadrat sumy:" + tableT.sum(table));

    }

}
