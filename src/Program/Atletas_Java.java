package Program;

import java.util.Locale;
import java.util.Scanner;

public class Atletas_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de atletas? ");
		int N = sc.nextInt();

		String TallestAthlete = null;
		double sumWeights = 0;
		double maxHeight = 0;
		int numberMen = 0;
		double sumHeightWomen = 0;
		int countWomen = 0;

		for (int i = 0; (i < N); i++) {
			
			System.out.println("Digite os dados do atleta numero "+ (i+1) +":");
			System.out.print("Nome: ");
			String name = sc.next();

			System.out.print("Sexo: ");
			char gender_ = sc.next().charAt(0);
			// Char toUpperCase
			char gender = Character.toUpperCase(gender_);
			
			while ((gender != 'M' && gender != 'F')) {

				System.out.print("invalido! Favor digitar F ou M: ");
				gender = sc.next().charAt(0);
			}

			if (gender == 'M') {
				numberMen += 1;
			}

			System.out.print("Altura: ");
			double height = sc.nextDouble();
			while (height <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				height = sc.nextDouble();
			}
			if (height > maxHeight) {
				maxHeight = height;
				TallestAthlete = name;
			}

			if (gender == 'F') {
				sumHeightWomen += height;
				countWomen += 1;
			}

			System.out.print("Peso: ");
			double weight = sc.nextDouble();
			while (weight <= 0) {

				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				weight = sc.nextDouble();
			}

			sumWeights += weight;

		}

		double AverageWeightAthletes = sumWeights / N;
		double percentageMen = (numberMen * 100) / N;
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas:  %.2f%n", AverageWeightAthletes);
		System.out.println("Atleta mais alto: " + TallestAthlete);
		System.out.printf("Porcentagem de homens:  %.1f %%%n", percentageMen);
		if (sumHeightWomen == 0) {
			String averageHeightWomen = "Não há mulheres cadastradas";
			System.out.println(averageHeightWomen);
		} else {
			double averageHeightWomen = sumHeightWomen/countWomen;
			System.out.println("Altura média das mulheres: %.2f%n " + averageHeightWomen);
		}
		
	}

}
