import java.util.Scanner;
public class ImparPar{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		long numero;
	System.out.println("Digite um numero:");
		numero = in.nextInt();
	if (numero == 0) {
			System.out.println("esse numero � neutro ()zero");
	} else if (numero > 0){
			System.out.println("esse numero � positivo");
	} else {
			System.out.println("esse numero � negativo");	
			}
	 in.close();
	}

}

,