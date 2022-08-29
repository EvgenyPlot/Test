package Algoritm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

    public static void main(String[] args) {
        int [ ] arrayInt = {2,3,4,1};
        int x = 0;

        int [] arrayOut = Arrays.stream(arrayInt).map(e -> e+e).toArray();
        IntStream x1 = Arrays.stream(arrayInt).map(e -> e);
        int x3 = x1.sum();

        for (int k = 0; k < arrayInt.length; k ++) {
            x += arrayInt[k];
        }

        System.out.println(x3);
        System.out.println(Arrays.toString(arrayOut));
    }

}
