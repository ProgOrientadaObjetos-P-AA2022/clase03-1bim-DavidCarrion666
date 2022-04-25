/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Agregar valores a los atributos de h1 y h2 por teclado

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // ---------------------------------------------------------------------
        
        System.out.println("Ingrese el nombre del primer hospital");
        String nombreHospital = entrada.nextLine();
        System.out.println("Ingrese el numero de camas del primer hospital");
        int camasUno = entrada.nextInt();
        System.out.println("Ingrese el presupuesto del primer hospital");
        double presupuestoUno = entrada.nextDouble();
        entrada.nextLine();
        
        // ---------------------------------------------------------------------
        
        System.out.println("Ingrese el nombre del segundo hospital");
        String nombreHospitalDos = entrada.nextLine();
        System.out.println("Ingrese el numero de camas del segundo hospital");
        int camasDos = entrada.nextInt();
        System.out.println("Ingrese el presupuesto del segundo hospital");
        double presupuestoDos = entrada.nextDouble();
        
        
        // ---------------------------------------------------------------------

        Hospital h1 = new Hospital();
        h1.establecerNombre(nombreHospital);
        h1.establecerNumeroCamas(camasUno);
        h1.establecerPresupuesto(presupuestoUno);

        Hospital h2 = new Hospital();
        h2.establecerNombre(nombreHospitalDos);
        h2.establecerNumeroCamas(camasDos);
        h2.establecerPresupuesto(presupuestoDos);

        // System.out.printf("%s \n", "Hola desde el main");
        
        System.out.println("-----------------------------------------------");
        
        System.out.printf("El nombre del hospital es %s, el numero de camas son"
                + " %d, y el presupuesto del hospital es %.2f\n", 
                h1.obtenerNombre(),
                h1.obtenerNumeroCamas(),
                h1.obtenerPresupuesto());

        System.out.printf("El nombre del segundo hospital es %s, el numero de "
                + "camas son %d, y el presupuesto del hospital es %.2f\n", 
                h2.obtenerNombre(),
                h2.obtenerNumeroCamas(),
                h2.obtenerPresupuesto());
    }
}
