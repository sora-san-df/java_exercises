package com.ejercicios.Ejercios_7_8_9;
import java.util.ArrayList;

public class Solution_6 {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();

        for(int i = 0; i<10; i++){
            intList.add(i);
        }

        for(int i =0; i<intList.size(); i++){
            if(intList.get(i) %2==0){
                intList.remove(intList.get(i));
            }
        }

        for(Integer result: intList){
            System.out.println(result);
        }
    }
}
