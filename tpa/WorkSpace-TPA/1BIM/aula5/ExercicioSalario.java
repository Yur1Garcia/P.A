import java.util.Scanner;
Public class ExercicioSalario {
   Public static void main (String[] args){
Scanner in = new Scanner (System.in);
   Double  salMinimo, salario, quantidade;
System.out.println("Digite o valor do sal�rio minimo");
    salMinimo = in.nextDouble();
 System.out.println("Digite o valor do salario");
    salario = in.nextDouble();
    quantidade = salario/salMinimo;
 System.out.println("A quantidade de sal�rios m�nimos em " +salario+ " � de " +quantidade);
}
}
