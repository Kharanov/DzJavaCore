package DZ4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String arr[] = new String[15];
        arr[0] = "q";
        arr[1] = "w";
        arr[2] = "e";
        arr[3] = "r";
        arr[4] = "t";
        arr[5] = "y";
        arr[6] = "u";
        arr[7] = "i";
        arr[8] = "a";
        arr[9] = "s";
        arr[10] = "d";
        arr[11] = "w";
        arr[12] = "t";
        arr[13] = "u";
        arr[14] = "p";
        Set<String> result = new HashSet<>(Arrays.asList(arr));
        System.out.println(result.size());
        for (String element : result) {

            System.out.println(element);
        }


    }
}
