package com.codegym;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Set<Integer> listnumber = new HashSet<>();
        listnumber.add(2);
        listnumber.add(0);
        listnumber.add(4);
        listnumber.add(26);
        listnumber.add(34);
        listnumber.add(22);
        listnumber.add(24);
        listnumber.add(21);

        CollectionUtilsAdapter adapter = new CollectionUtilsAdapter();
        Client client = new Client(adapter);
        client.printMaxValue(listnumber);

    }
}
