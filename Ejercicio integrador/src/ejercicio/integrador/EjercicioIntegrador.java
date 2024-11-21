/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.integrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int b = 2;
        String Lista[][] = new String[7][7];

        System.out.println("" + Lista[1][1]);
        String a = JOptionPane.showInputDialog("Ingrese el numero de productos a ingresar    ");
        b = Integer.parseInt(a);
        for (int i = 1; i <= b; i++) {
            Lista[1][1] = JOptionPane.showInputDialog("producto    ");
            Lista[2][1] = JOptionPane.showInputDialog("numero de ventas    ");
            Lista[3][1] = JOptionPane.showInputDialog("Dia de la semana   ");

            System.out.println("Producto: " + Lista[1][1] + "    ventas " + Lista[2][1] + "     " + Lista[3][1]);
            int c = 0;
            c = c + Integer.parseInt(Lista[2][1]);

            System.out.println("Total de ventas por producto  " + c);
        }

        System.out.println("El dia de mayor ventas fue " + Lista[3][1]);
        System.out.println("El producto mas vendido fue  " + Lista[1][1]);
        System.out.println("con el siguiente numero de ventas  " + Lista[2][1]);

    }
}
