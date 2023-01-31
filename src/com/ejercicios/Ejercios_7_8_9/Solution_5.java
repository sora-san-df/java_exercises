package com.ejercicios.Ejercios_7_8_9;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution_5 {


    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("HUH");
        myArrayList.add("Vampire");
        myArrayList.add("yes");
        myArrayList.add("hehe");

        for(String thing: myArrayList){
            System.out.println(thing);
        }
        LinkedList<String> myLinkedList = new LinkedList<>(myArrayList);
        for (String moreThing: myLinkedList){
            System.out.println(moreThing);
        }
    }



}
