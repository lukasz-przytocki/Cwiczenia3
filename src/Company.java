import java.util.Scanner;

public class Company {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość pracowników");
        int tableSize = scan.nextInt();
        scan.nextLine();
        Employee[] employees = new Employee[tableSize];
        Employer employer = new Employer();
        int i;

        for(i=0; i<employees.length; i++){
            employees[i] = new Employee();
            System.out.printf("Podaj imie pracownika: ");
            employees[i].setFirstName(scan.nextLine());
            System.out.printf("Podaj nazwisko pracownika:");
            employees[i].setLastName(scan.nextLine());
            System.out.printf("Poadaj zarobki: ");
            employees[i].setSalary(scan.nextInt());
            scan.nextLine();
        }



        System.out.println("Company needs to spend " + employer.totalSalary(employees));
    }
}
