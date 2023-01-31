package com.ejercicios.Ejercios_7_8_9;

public class Solution_2 {

    public static void main(String[] args) {
        int[][] myBidi = new int[1][4];

        myBidi[0][0]=1;
        myBidi[0][1]=4;
        myBidi[0][2]=3;
        myBidi[0][3]=5;


        for(int i=0; i<myBidi.length; i++){
            for(int j=0; j<myBidi[i].length; j++){
                System.out.println( myBidi[i][j]);
            }
        }
    }
}
