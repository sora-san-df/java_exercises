package com.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class SmarthDevices {

    public  class SmartPhone{
        //Atributos
        String marca;
        String memorySpace;
        String modelo;
        String camera;

        public SmartPhone(){}

        public SmartPhone(String marca, String memorySpace, String modelo, String camera){
            this.marca = marca;
            this.memorySpace = memorySpace;
            this.modelo = modelo;
            this.camera = camera;
        }


        @Override
        public String toString() {
            return "SmartPhone{" +
                    "marca='" + marca + '\'' +
                    ", memorySpace='" + memorySpace + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", camera='" + camera + '\'' +
                    '}';
        }
    }

    public class SmartWatch{
        //Atributos
        String marca;

        String modelo;

        public SmartWatch(){}

        public SmartWatch(String marca, String modelo){
            this.marca = marca;
            this.modelo=  modelo;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    '}';
        }
    }
}
