package com.ejercicios.Ejercios_7_8_9;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution_9 {
    public static void main(String[] args) {

        //Create an ArrayList and HashMap
        ArrayList<Integer> myList = new ArrayList<>();
        HashMap<Integer, ArrayList> myHashMap = new HashMap<>();

        for(int i = 0; i<5; i++){
            myList.add(i);
            myHashMap.put(i, myList);
        }
        //
        try{
            PrintStream result = new PrintStream(new FileOutputStream("Output.txt"));
            result.println(myHashMap);
            result.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
