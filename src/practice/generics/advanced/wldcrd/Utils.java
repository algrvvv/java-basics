package practice.generics.advanced.wldcrd;

import java.util.List;

public class Utils{
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
