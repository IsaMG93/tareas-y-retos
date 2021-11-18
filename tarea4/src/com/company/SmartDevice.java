package com.company;

public class SmartDevice {

    String conectividad;
    String sistemaOperativo;
    boolean bluetooth;
    boolean NFC;
    int gbRAM;
    int mahBateria;
    int contraseña;

    public SmartDevice() {
    }

    public SmartDevice(String conectividad, String sistemaOperativo, boolean bluetooth, boolean NFC, int gbRAM, int mahBateria, int contraseña) {
        this.conectividad = conectividad;
        this.sistemaOperativo = sistemaOperativo;
        this.bluetooth = bluetooth;
        this.NFC = NFC;
        this.gbRAM = gbRAM;
        this.mahBateria = mahBateria;
        contraseña = contraseña;
    }

    public void cambiarContraseña(int contraseña) {
        this.contraseña = contraseña;
        System.out.println("contraseña cambiada");

    }


    public void estadoBluetooth(int estado) {
        while (this.bluetooth) {
            if (estado == 0){
                System.out.println("este dispositivo está apagado");
            } else {
                System.out.println("este dispositivo está prendido");
            }
        }
        System.out.println("este dispositivo no cuenta con bluetooth");

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "conectividad='" + conectividad + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", gbRAM=" + gbRAM +
                ", mahBateria=" + mahBateria +
                ", contraseña=" + contraseña +
                '}';
    }
}








