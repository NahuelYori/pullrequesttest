package com.company;

import java.io.FileNotFoundException;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Integer [] arr = {1,2,50,20,0,10,25,15};
        String [] arr2 = {"Nahuel","Ariel","Julian","Yori","Maldonado","Zeta","Zaraza","Genu"};
        Integer [] bigArray = new Integer[100000];

        Comparator<Integer> integerComparator = (x,y) -> x-y;
        Comparator<String> stringComparator = (x,y) -> x.compareTo(y);

        Timer timer = new Timer();
        Sorter sorter = (Sorter) MiFactory.getInstance("MiFactory.properties");

        int num = 999999999;
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = num--;
        }

        //Array gigante para romper servidores(tampoco tanto)
        timer.start();
        sorter.sort(bigArray, integerComparator);
        timer.stop();
        System.out.println(timer.elapsedTime());

        //Array de enteros
        timer.start();
        sorter.sort(arr, integerComparator);
        timer.stop();
        System.out.println(timer.elapsedTime());

        //Array de strings
        timer.start();
        sorter.sort(arr2, stringComparator);
        timer.stop();
        System.out.println(timer.elapsedTime());
    }
}
