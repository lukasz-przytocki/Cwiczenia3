public class FizzBuzz {
    public static void main(String[] args) {

        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0){ //albo i%15
                System.out.print(i + "  FizzBuzz\n");
            }else if(i%5==0){
                System.out.print(i+"  Buzz\n");
            }else if(i%3==0){
                System.out.printf(i+ "  Fizz\n");
            }

        }

    }
}
