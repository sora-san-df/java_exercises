package com.ejercicios.Ejercios_7_8_9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class Solution_8 {
    public static void main(String[] args) {

        try{
            InputStream myFile = new FileInputStream("/example/Hehe.txt");
            PrintStream finalFile = new PrintStream("result.txt");

            fichero(myFile, finalFile);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }

    public static void fichero(InputStream fileIn, PrintStream fileOut){

         fileOut.print(fileIn);
         fileOut.close();
    }
}
