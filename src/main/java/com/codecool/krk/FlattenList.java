package com.codecool.krk;

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
}
