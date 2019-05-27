public class TwoDimTable1 {
    public static void main(String[] args) {
        int[][] table = new int[11][11];

        for (int i=0;i<table.length;i++){
            for (int j=0; j<table.length;j++){
                table[i][j] = (i+j)*(i+j);
                System.out.print(table[i][j] +"\t");

            }
            System.out.println();
        }

        int sum = 0;
        for (int i=0; i<table.length;i++){
            sum+= table[i][i];
            sum+= table[i][table.length-1-i];
        }


        System.out.print("Suma przekątnych: " + sum);
    }
}
