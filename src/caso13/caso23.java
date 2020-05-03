package caso13;
import java.util.Scanner;
public class caso23 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingresa el presio: ");
		float presio = sc.nextFloat();

		System.out.print("Ingresa la cantidad: ");
		float cantidad = sc.nextFloat();
		
		float importe = presio * cantidad;
		float IGV = (float) (importe * 0.18);
		float descuento = (float) (importe * 0.03);
		float total = (importe - descuento) + IGV; 
		
		System.out.println("El importe es: " + importe);
		System.out.println("El IGV es: " + IGV);
		System.out.println("El descuento es: " + descuento);
		System.out.println("El total es: " + total);


	}

}
