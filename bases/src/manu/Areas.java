package manu;

import java.util.*;
import javax.swing.*;


public class Areas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int respuesta = sc.nextInt();
		
		switch (respuesta) {
		case 1: {
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el lado"));
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			
			break;
		}
		case 2: {
			
		}
		case 3: {
			
		}
		case 4: {
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + respuesta);
		}
	}

}
