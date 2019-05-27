public class TwoDimensionalTable {

    double sum(double[] table){
        double sum=0;
        for (double value: table){
            sum+=value*value;
        }
        return sum;

    }
}
