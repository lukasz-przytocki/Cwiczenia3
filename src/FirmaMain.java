import java.util.Arrays;
import java.util.Scanner;

public class FirmaMain {
    public static void main(String[] args) {
        Firma firma = new Firma(3);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj ilość pracowników: ");
        int iloscPracownikow = scanner.nextInt();
        scanner.nextLine();
        Pracownik[] pracownik = new Pracownik[iloscPracownikow];

        for(int i=0;i<iloscPracownikow;i++){
            pracownik[i] = new Pracownik();
            System.out.printf("Podaj imie pracownika: ");
            String name = scanner.nextLine();
            pracownik[i].setFirstName(name);
            System.out.printf("Podaj nazwisko pracownika: ");
            name = scanner.nextLine();
            pracownik[i].setLastName(name);
            System.out.printf("Podaj zarobki: ");
            int zarobki = scanner.nextInt();
            pracownik[i].setSalary(zarobki);
            scanner.nextLine();

        }

        for(int i=0; i<iloscPracownikow;i++){
            System.out.println(pracownik[i].getFirstName() +" " + pracownik[i].getLastName() + " " + pracownik[i].getSalary());
        }




    }
}
