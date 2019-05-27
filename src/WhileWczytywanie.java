import java.util.Scanner;

public class WhileWczytywanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wartosć z przedziału -100 do 100: ");
        int var = scan.nextInt();

        if(var>100 || var<-100){
            System.out.println("Wartość spoza przedziału");

        }else if(var>0){
            while (var<=100){
                System.out.println(var);
                var++;
            }
        }else if(var<0){
            while (var>=-100){
                System.out.println(var);
                var--;
            }
        }

    }
}
