package bibliotecas;

import java.util.Scanner;

public class Consola {
	private static final Scanner SC = new Scanner(System.in);

	public static void pl() {
		System.out.println();
	}

	public static void pl(String mensaje) {
		System.out.println(mensaje);
	}

	public static void p(String mensaje) {
		System.out.print(mensaje);
	}

	public static int pedirEntero() {
		int entero = SC.nextInt();
		SC.nextLine();
		return entero;
	}

	public static int pedirEntero(String mensaje) {
		p(mensaje + ": ");

		return pedirEntero();
	}

	public static String pedirTexto(String mensaje) {
		p(mensaje + ": ");

		return SC.nextLine();
	}
}
