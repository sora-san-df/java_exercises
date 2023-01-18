package com.ejercicios.InterfaceClass;

import com.ejercicios.InterfaceClass.CocheCRUD;

public class CocheCRUDImpl implements  CocheCRUD {
    @Override
    public void save(String methodName) {
        System.out.println(methodName);
    }

    @Override
    public void findAll(String methodName) {
        System.out.println(methodName);
    }

    @Override
    public void delete(String methodName) {
        System.out.println(methodName);
    }
}
