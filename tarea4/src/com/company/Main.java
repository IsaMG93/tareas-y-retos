package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        SmartDevice olo = new SmartDevice("3G", "Android", false, true, 2, 3750, 1234);
        olo.cambiarContraseña(5263);
        System.out.println(olo.contraseña);
        System.out.println(olo);

        System.out.println(olo.bluetooth);
        olo.estadoBluetooth(0);

        SmartPhone xiaomi = new SmartPhone("5G", "ANDROID", true, true, 2, 2, 1234, "Xiaomi", "MI9", true, 123456, "Whatsapp");
        xiaomi.marcarTelefono(145263, "luis");
        xiaomi.entrarServicioMensajeria("Meta", "Isaias");

        SmartWatch samsung = new SmartWatch("4G", "ANDROID", false, true, 1, 340, 1234, 120, 50);
        samsung.indicarKcalquemadas(65.3,22.1);

        System.out.println(samsung);



    }


    }



