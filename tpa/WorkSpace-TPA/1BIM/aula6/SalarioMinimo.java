import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        double salarioMinimo = 1302;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu sal�rio: ");
        double salUsuario = scanner.nextDouble();
        if (salUsuario > salarioMinimo) {
            System.out.println("Seu sal�rio est� acima do sal�rio m�nimo.");
        } else if (salUsuario < salarioMinimo) {
            System.out.println("Seu sal�rio est� abaixo do sal�rio m�nimo.");
        } else {
            System.out.println("Seu sal�rio � igual ao sal�rio m�nimo.");
        }
    }
}