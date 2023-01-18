package com.ejercicios.InterfaceClass;

import com.ejercicios.InterfaceClass.CocheCRUDImpl;
import com.ejercicios.InterfaceClass.CocheCRUD;

public class CocheCRUDMain {

    public static void main(String[] args) {

        CocheCRUD miCoche = new CocheCRUDImpl();

        miCoche.save("Save");
        miCoche.delete("delete");
        miCoche.findAll("findAll");



    }
}
