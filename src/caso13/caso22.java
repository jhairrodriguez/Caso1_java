package caso13;
import java.util.Scanner;
public class caso22 {

	public static void main(String[] args) {
		Scanner uni = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		float not1 = sc.nextFloat();

		System.out.print("Ingrese nota 2: ");
		float not2 = sc.nextFloat();

		System.out.print("Ingrese nota 3: ");
		float not3 = sc.nextFloat();

		float total = (float) ((not1*0.20) + (not2*0.30) + (not3*0.50));
		
		System.out.println("----- R E S U L T A D O S -----");

		System.out.print("El Promedio final de "+ nombre + " es: " + total);

	}

}
