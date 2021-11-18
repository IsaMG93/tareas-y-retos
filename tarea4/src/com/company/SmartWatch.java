package com.company;

public class SmartWatch extends SmartDevice{

    int pulsacionesPorMinuto;
    double kmRecorridos;

    public SmartWatch() {
    }

    public SmartWatch(String conectividad, String sistemaOperativo, boolean bluetooth, boolean NFC, int gbRAM, int mahBateria, int contraseña, int pulsacionesPorMinuto, int kmRecorridos) {
        super(conectividad, sistemaOperativo, bluetooth, NFC, gbRAM, mahBateria, contraseña);
        this.pulsacionesPorMinuto = pulsacionesPorMinuto;
        this.kmRecorridos = kmRecorridos;
    }

    public void indicarKcalquemadas (double peso, double kmRecorridos){

        this.kmRecorridos = kmRecorridos;
        double kcal = 1.03;
        double kcalquemadas = (peso*kcal)*kmRecorridos;
        System.out.println("En la ruta de hoy, has quemado " + kcalquemadas + "calorías.");


    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "conectividad='" + conectividad + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", gbRAM=" + gbRAM +
                ", mahBateria=" + mahBateria +
                ", contraseña=" + contraseña +
                ", pulsacionesPorMinuto=" + pulsacionesPorMinuto +
                ", kmRecorridos=" + kmRecorridos +
                '}';
    }
}
