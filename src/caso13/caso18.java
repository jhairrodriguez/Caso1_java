package caso13;
      import java.util.Scanner;
public class caso18 {

	public static void main(String[] args) {
		
		Scanner Uni=new Scanner(System.in);
		System.out.println("Ingrese base: ");
		float base=Uni.nextFloat();
		System.out.println("Ingrese altura: ");
		float altura=Uni.nextFloat();
		float area=(base*altura)/2;
		System.out.println("El area del triangulo es: "+area);
		

	}

}
