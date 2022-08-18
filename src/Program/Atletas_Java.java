package Program;

import java.util.Locale;
import java.util.Scanner;

public class Atletas_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a quantidade de atletas? ");
		int N = sc.nextInt();

		for (int i = 0; (i < N); i++) {

			System.out.print("Nome: ");
			String name = sc.next();

			System.out.print("Sexo: ");

			char gender = sc.next().charAt(0);

			while (!(gender == 'M' && gender == 'F')) {

				System.out.println("invalido! Favor digitar F ou M: ");
				gender = sc.next().charAt(0);
			}

			System.out.print("Altura: ");
			double height = sc.nextDouble();
			while (height <= 0) {
				System.out.println("Valor invalido! Favor digitar um valor positivo: ");
				height = sc.nextDouble();
			}

			System.out.print("Peso: ");
			double weight = sc.nextDouble();

			while (weight <= 0) {

				System.out.println("Valor invalido! Favor digitar um valor positivo: ");
				weight = sc.nextDouble();
			}
			
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas:  %.2f%n",);

		}

	}

}
