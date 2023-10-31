package com.ayush;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //SYNTAX
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);
        list.add(247);
        list.add(4);
        list.add(26);
        list.add(36);
        list.add(784);

        //System.out.println(list.contains(35)); //false
        //System.out.println(list.contains(784)); //true, as it contain that particular number in Arraylist

        //changing array
       // System.out.println(list);
        //System.out.println(list.set(0, 11)); // here 0 is 0th index and 11 is the number which have to change

        //System.out.println(list.set(1, 22));



        //Removing Array
        System.out.println(list); //before
        list.remove(1);
        System.out.println(list); //after
    }
}
