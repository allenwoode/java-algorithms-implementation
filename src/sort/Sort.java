package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {


    public static void main(String[] args) {

        String[] sequence = {"i", "walk", "on", "the", "line"};
        List<String> list = Arrays.asList(sequence);
        Collections.sort(list);
        System.out.println(list);
    }
}
