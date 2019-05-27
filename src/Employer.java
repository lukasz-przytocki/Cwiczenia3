import java.util.Scanner;

public class Employer {
Scanner scan = new Scanner(System.in);

    void add(Employee emp){
        System.out.println("Podaj imie pracownika");
        emp.setFirstName(scan.nextLine());
        System.out.println("Podaj nazwisko pracownika");
        emp.setLastName(scan.nextLine());
        System.out.println("Podaj zarobki");
        emp.setSalary(scan.nextInt());
        scan.nextLine();
    }

    int totalSalary(Employee[] employees){
        int totalSalary=0;
        for(int i=0; i<employees.length;i++){
           totalSalary+=employees[i].getSalary();

        }
        return totalSalary;
    }

}
