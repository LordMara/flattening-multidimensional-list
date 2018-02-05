package com.codecool.krk;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FlattenList {
    public List<Object> flatten(List<Object> listToFlatten) {
        List<Object> flattenedList = new LinkedList<>();

        for (Object element: listToFlatten) {
            if (element instanceof List) {
                flattenedList.addAll(flatten((List<Object>) element));
            } else {
                flattenedList.add(element);
            }
        }
        return flattenedList;
    }

    public static void main( String[] args ) {
        // Example list 1
        // [1, 3, "codecool", 5, 8]
        List<Object> test1 = Arrays.asList(1, 3, "codecool", 5, 8);

        // Example list 2
        // [ 1, 3, ["age", 5], "Kraków", [1, [3, [4, 5], "codecool"], 6, 7]]
        List<Object> test2 = new LinkedList<>();
        test2.add(Arrays.asList(1, 3));
        test2.add(Arrays.asList("age", 5));
        test2.add("Kraków");
        test2.add(Arrays.asList(1,Arrays.asList(3, Arrays.asList(4, 5), "codecool"), 6, 7));

        FlattenList flattenList = new FlattenList();

        System.out.println(flattenList.flatten(test1));
        System.out.println(flattenList.flatten(test2));
    }
}
