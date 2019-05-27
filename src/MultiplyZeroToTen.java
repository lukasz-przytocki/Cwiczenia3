public class MultiplyZeroToTen {
    public static void main(String[] args) {
        int sum=1;
        for(int i=1; i<=10; i++){
            sum+=i;
            for(int j=10;j>=1;j--){
                if(sum%j==0){
                    break;
                }//nieskończone
            }
        }
        System.out.print(sum);
    }
}
