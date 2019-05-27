import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        int[] table = new int[10];
        Random random = new Random();
        int i;
        int sum=0;
        int belowAvetrage=0;
        int aboveAverage=0;

        for(i=0;i<table.length;i++){
            table[i]= random.nextInt(100);
            sum+=table[i];
        }
        int average = sum/table.length;

        for(i=0;i<table.length;i++){
            if(table[i]<average){
                belowAvetrage+=table[i];
            }else if(table[i]>average){
                aboveAverage+=table[i];
            }
        }
        System.out.printf("Srednia: %d\n", average);
        System.out.println("Suma powyżej średniej:" + aboveAverage);
        System.out.println("Suma poniżej sredniej: " + belowAvetrage);

    }
}
