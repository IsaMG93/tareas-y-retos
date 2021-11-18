package com.company;

public class SmartPhone extends SmartDevice{

    String marca;
    String modelo;
    boolean camara;
    int numeroTelefono;
    String servicioMensajeria;

    public SmartPhone (){
    }

    public SmartPhone(String conectividad, String sistemaOperativo, boolean bluetooth, boolean NFC, int gbRAM, int mAhBateria, int contraseña, String marca, String modelo, boolean camara, int númeroTeléfono, String servicioMensajeria) {
        super(conectividad, sistemaOperativo, bluetooth, NFC, gbRAM, mAhBateria, contraseña);
        this.marca = marca;
        this.modelo = modelo;
        this.camara = camara;
        this.numeroTelefono = numeroTelefono;
        this.servicioMensajeria = servicioMensajeria;
    }

    public void marcarTelefono(int numeroContacto, String contacto){
        System.out.println("Llamando a: "+ contacto + "\n" + numeroContacto);
    }

    public void entrarServicioMensajeria (String servicioMensajeria, String usuario){
        this.servicioMensajeria = servicioMensajeria;
        System.out.println("Bienvenido de nuevo a " + servicioMensajeria + ", " + usuario + ".");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "conectividad='" + conectividad + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", gbRAM=" + gbRAM +
                ", mahBateria=" + mahBateria +
                ", contraseña=" + contraseña +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", camara=" + camara +
                ", numeroTelefono=" + numeroTelefono +
                ", servicioMensajeria='" + servicioMensajeria + '\'' +
                '}';
    }
}
