import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = leia.nextInt();
        
        System.out.println("Digite o valor de B: ");
        B = leia.nextInt();
        
        System.out.println("Digite o valor de C: ");
        C = leia.nextInt();
        
        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if (A == B && B == C) {
                System.out.println("Tri�ngulo Equil�tero");
            } else if (A == B || B == C || A == C) {
                System.out.println("Tri�ngulo Is�sceles");
            } else {
                System.out.println("Tri�ngulo Escaleno");
            }
        } else {
            System.out.println("N�o � poss�vel formar um tri�ngulo com essas medidas.");
        }
    }
}
