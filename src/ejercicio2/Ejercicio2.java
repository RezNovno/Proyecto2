/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author israc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int prendas;
        double precio, total=0, descuento = 0,pagot = 0;
        
        System.out.print("Ingrese el total de prendas que desee adquirir: ");
        prendas = sc.nextInt();
        
        for (int i = 1; i <= prendas; i++) {
            System.out.print("Ingrese el precio de la prenda numero " + i + ": ");
            precio = sc.nextDouble();
            total = total + precio;
        }
        
        System.out.println("Su total a pagar en esta compra es de: " + total);
        if (total>=100) {
            descuento = total*0.05;
                    pagot = total-descuento; 
            if (total>=200) {
                descuento = total*0.10;
                    pagot = total-descuento; 
                if (total>=300) {
                    descuento = total*0.15;
                    pagot = total-descuento;        
                }
            }
        }else{
            System.out.println("Usted no aplica al descuento");
            pagot=total;
        }
        
        System.out.println("Su decuento en esta compra fue de: " + descuento);
        System.out.println("El pago final una vez aplicado el descuento es de: " + pagot);
    }
    
}
