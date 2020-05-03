package caso13;
import java.util.Scanner;
public class caso24 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer monto: ");
		float mon1 = sc.nextFloat();

		System.out.print("Ingrese segundo monto: ");
		float mon2 = sc.nextFloat();
		
		System.out.print("Ingrese tercer monto: ");
	    float mon3 = sc.nextFloat();

	    float a = (float) ((mon1 / 5) + (mon2 * 0.2));
	    float b = (float) (((mon3 + mon3) * 0.6) / 2);
	    float todo = (float) (mon1 + mon2 + mon3);
	    float c = (float) (todo * 0.08);
	    
	    System.out.println("El primer moento es: " + a);
	    System.out.println("El segundo monto es: " + b);
	    System.out.println("El tercer numero es: " + c);
	}

}
