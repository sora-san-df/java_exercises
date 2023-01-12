package com.ejercicios;

public class Functions {
    public static void main (String[] args){

        //16% iva en colombia
        int price = getPrice(100000, 16);

        System.out.println(price);
    }

    public static int getPrice(int price, int IVA){
        return (price * IVA)/100;
    }
}
