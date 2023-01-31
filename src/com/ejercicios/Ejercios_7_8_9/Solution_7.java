package com.ejercicios.Ejercios_7_8_9;

public class Solution_7 {

    public static void main(String[] args) {

        try{
            DividePorCero(2,0);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo codigo");
        }

    }

    public static Integer DividePorCero(int number, int number2) throws ArithmeticException{
        return number / number2;
    }
}
