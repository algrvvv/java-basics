package practice.generics.advanced.wldcrd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Utils.sumNumbers(intList));

        List<Double> doubleList = Arrays.asList(1.5, 2.9, 3.0, 4.2);
        System.out.println(Utils.sumNumbers(doubleList));
    }
}
