import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        double distancia, capacidade, gastoMedio;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a dist�ncia percorrida em km: ");
        distancia = leia.nextDouble();
        
        System.out.println("Digite a capacidade do tanque: ");
        capacidade = leia.nextDouble();
        
        gastoMedio = distancia / capacidade;
        System.out.println("Este � o gasto m�dio: " + gastoMedio);
        
        if (gastoMedio >= 10) {
            System.out.println("Econ�mico");
        } else {
            System.out.println("N�o econ�mico");
        }
    }
}
