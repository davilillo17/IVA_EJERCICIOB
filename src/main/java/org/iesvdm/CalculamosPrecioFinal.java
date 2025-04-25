package org.iesvdm;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el precio final de un producto según su  base imponible (precio antes de impuestos),
 * el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro,
 * mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos,
 * aunque los números no estén tabulados.

     Ejemplo:
     Introduzca la base imponible: 25
     Introduzca el tipo de IVA (general, reducido o superreducido): reducido
     Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
     Base imponible        25.00
     IVA (10%)              2.50
     Precio con IVA        27.50
     Cód. promo. (mitad): -13.75
     TOTAL                 13.75

 * 
 */

public class CalculamosPrecioFinal {

		    public void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduzca la base imponible: ");
		        double baseImponible = scanner.nextDouble();

		     
		        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		        String tipoIva = scanner.next().toLowerCase();


		        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		        String codigoPromo = scanner.next().toLowerCase();
		        
		        
		        
		        double iva = 0;
		        if(tipoIva.equals("general")) {
		        	iva = 0.21;
		        } else if (tipoIva.equals("reducido")) {
		        	iva = 0.10;
		        } else if (tipoIva.equals("superreducido")) {
		        	iva = 0.04;
		        }
		        
		        double cantidadIva = baseImponible * iva;
		        double precioConIva = baseImponible + cantidadIva;

		        double descuento = 0;
		        if (codigoPromo.equals("mitad")) {
		            descuento = precioConIva / 2;
		        } else if (codigoPromo.equals("meno5")) {
		            descuento = 5;
		        } else if (codigoPromo.equals("5porc")) {
		            descuento = precioConIva * 0.05;
		        }
		        
		        
		        double precioFinal = precioConIva - descuento;

		        System.out.printf("Base imponible        %.2f\n", baseImponible);
		        System.out.printf("IVA (%.0f%%)            %.2f\n", iva * 100, cantidadIva);
		        System.out.printf("Precio con IVA        %.2f\n", precioConIva);
		       
		       
		    }
		    
		    
}
