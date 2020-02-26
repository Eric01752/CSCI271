package classwork;

import java.util.Comparator;

public class DoubleComparator implements Comparator<Double>{
    @Override
    public int compare(Double d1, Double d2){
        
        double doubleDifference = d1.doubleValue() - d2.doubleValue();
        
        if(doubleDifference == 0.0){
            return 0;
        }
        else if(doubleDifference >= 1){
            return -1;
        }
        else{
            return 1;
        }
    }
}
