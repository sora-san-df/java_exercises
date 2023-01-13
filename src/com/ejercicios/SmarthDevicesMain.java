package com.ejercicios;
import com.ejercicios.SmarthDevices;

public class SmarthDevicesMain {

    public static void main(String[] args) {

        SmarthDevices myDevice = new SmarthDevices();

        SmarthDevices.SmartPhone Phone = myDevice.new SmartPhone("Iphone", "32mb", "12","900px");
        SmarthDevices.SmartWatch Watch = myDevice.new SmartWatch("Samgsung", "2022");

        System.out.println(Watch.toString());
        System.out.println(Phone.toString());
    }
}
