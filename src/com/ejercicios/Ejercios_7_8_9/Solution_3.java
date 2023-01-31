package com.ejercicios.Ejercios_7_8_9;
import java.util.Vector;
//Nestor Raúl López

public class Solution_3 {
    public static void main(String[] args) {

        Vector<String> miVector = new Vector<String>();
        miVector.add("Bokura underground");
        miVector.add("itte");
        miVector.add("inferno");
        miVector.add("Sillhoutte");
        miVector.add("AYAYA");

        for(String names: miVector){
            System.out.println(names);
        }

        miVector.remove(2);
        miVector.remove(3);


        System.out.println("after the remove dogeSmile");
        for (String names2: miVector){
            System.out.println(names2);
        }

        //Soluition 4
        /**
         *
         * El problema se encuentra en que cada vez que se excede el limite de un vector, este copia toooodo lo que tiene y crea un nuevo vector
         * sumado al/los nuevos elementos.
         * **/
    }
}
