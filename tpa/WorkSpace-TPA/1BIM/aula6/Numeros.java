import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.print("Digite um n�mero: ");
         numero = scanner.nextDouble();
        if (numero == 0) {
            System.out.println("O n�mero � neutro (zero).");
        } else if (numero > 0) {
            System.out.println("O n�mero � positivo.");
        } else {
            System.out.println("O n�mero � negativo.");
        }
    }
}