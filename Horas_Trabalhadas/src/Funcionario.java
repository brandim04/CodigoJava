import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o ID do funcionário: ");
		int id = sc.nextInt();
		
		System.out.print("Informe o número de horas trabalhadas do funcionário: ");
		int horas_trabalhadas = sc.nextInt();
		
		System.out.print("Informe o valor recebido por hora trabalhada: ");
		double valor = sc.nextDouble();
		
		double salario = horas_trabalhadas * valor;
		
		System.out.printf("ID funcionário: %d | Salário: R$ %.2f\n", id, salario);

		
		sc.close();
	}

}
