package com.ejercicios.Ejercios_7_8_9;

public class Solution {

    public static void main(String[] args) {
        reverse("Hola mundo");
    }

    public static void reverse(String text){
       for(int i = text.length()-1; i>=0; i--){
           System.out.println(text.charAt(i));
       }
    }

}
