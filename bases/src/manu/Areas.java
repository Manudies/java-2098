package manu;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

		int respuesta = sc.nextInt();

		switch (respuesta) {
		case 1: {
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el lado en cm"));

			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2) + "cm2");
			break;
		}
		case 2: {
			int base = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la base del triangulo en cm"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura del triangulo en cm"));
			
			System.out.println("El area del triangulo es: " + ((base*altura)/2) + "cm2");
			break;

		}
		case 3: {
			int base = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la base del triangulo en cm"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura del triangulo en cm"));
			
			System.out.println("El area del triangulo es: " + ((base*altura)/2) + "cm2");
			break;

		}
		case 4: {
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el radio en cm"));
						
			System.out.println("El area del circulo es: " + Math.pow(radio, 2)*Math.PI + "cm2");
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + respuesta);
		}
	}

}
