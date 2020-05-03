package caso13;
import java.util.Scanner;
public class caso19 {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese valor: ");
		float valor=sc.nextFloat();
		float aumento=(float) (1.42*valor);
		System.out.println("El aumento de la venta es: "+aumento);

	}

}
