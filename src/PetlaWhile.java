import java.util.Scanner;

public class PetlaWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] table = new int[5];
        int i = table.length;


        while (i>0){
            i--;
            System.out.println("Podaj liczbę: ");
            table[i] = scan.nextInt();

        }

        System.out.println("Wynik: ");
        i=5;
        int wynik=0;
        do{
            i--;
            wynik+=table[i];

        }while (i>0);
        System.out.println(wynik);

    }
}
