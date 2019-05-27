import javax.sound.midi.Soundbank;

public class Palindrom {
    public static void main(String[] args) {
        int[] table = {1,2,3,4,5,4,3,2,1};
        System.out.println(table.length);
        for(int i =0;i<=table.length/2;i++){
            if(table[i]!=table[table.length-1-i]){
                System.out.println("Tablica nie jest palidromem");
                break;
            }else if(i==table.length/2){
                System.out.println("Palidron");
            }
        }


        }
    }

