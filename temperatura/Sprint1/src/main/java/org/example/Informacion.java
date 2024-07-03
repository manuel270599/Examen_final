package org.example;
import java.util.Scanner;

public class Informacion {
    public static void main(String[] args){
        float temperatura,cantidad,velocidad,humedad,presion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESANDO INFORMACION");
        System.out.print("Temperatura:");
        temperatura=entrada.nextFloat();
        System.out.print("Cantidad:");
        cantidad=entrada.nextFloat();
        System.out.print("Velocidad:");
        velocidad=entrada.nextFloat();
        System.out.print("Humedad:");
        humedad=entrada.nextFloat();
        System.out.print("Presion:");
        presion= entrada.nextFloat();;

        Clima obj = new Clima(temperatura,cantidad,velocidad,humedad,presion);
        obj.Alarmas();
        obj.Notificacion();

    }
}
