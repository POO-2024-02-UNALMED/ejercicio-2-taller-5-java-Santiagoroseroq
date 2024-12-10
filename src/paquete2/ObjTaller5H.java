package paquete2;

import paquete1.Auto;

public class ObjTaller5H {
    public static void main(String[]args){
        Moto moto = new Moto("XYZ123", "2019");
        Bus bus =new Bus("ABC345", 20);
        moto.adelantar();
        bus.arrancar();
        bus.pitar();
        moto.getVelocidad();
         int numAutosCreados = Auto.num_autos;
        System.out.println("Número de autos creados: " + numAutosCreados);
        System.out.println("Placa de la moto: " + moto.getPlaca());
        System.out.println("Modelo de la moto: " + moto.getModelo());
        
        System.out.println("Placa del bus: " + bus.getPlaca());
        System.out.println("Capacidad del bus: " + bus.getCapacidad());
        
    }
}
