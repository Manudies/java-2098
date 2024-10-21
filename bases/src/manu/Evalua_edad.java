package manu;

import java.util.*;

public class Evalua_edad {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		
		System.out.println("Tu edad es: " + edad);
		if(edad<18) {
			System.out.println("Eres menor de edad");
		}
		else {
			System.out.println("Ya puedes ir a la carcel legalmente");
			}
	sc.close();
	}
}