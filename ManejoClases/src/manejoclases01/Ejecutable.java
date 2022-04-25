/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;

public class Ejecutable {

    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital hospitalLoja = new Hospital();

        // Se asigna valores particulares al objeto
        hospital.nombre = "Hospital UTPL";
        hospital.numeroCamas = 750;
        hospital.presupuesto = 462940.43;

        hospitalLoja.nombre = "Isidro Ayora";
        hospitalLoja.numeroCamas = 300;
        hospitalLoja.presupuesto = 746987.50;

        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto, hospitalLoja.nombre,
                hospitalLoja.numeroCamas, hospitalLoja.presupuesto);

        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
