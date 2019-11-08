package br.com.calculadoraIMC;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso;
		double altura;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu peso:");
		peso = leia.nextDouble();
		System.out.println("Informe a sua altura:");
		altura = leia.nextDouble();
		
		double imc;
		imc = peso / (altura*altura);
		
		if(imc < 20) {
			System.out.println("Magro");
		}else if(imc >= 20 && imc <= 24) {
			System.out.println("Normal");
		}else if (imc >= 25 && imc <= 29) {
			System.out.println("Acima do peso");
		}else if (imc >= 30 && imc <= 34) {
			System.out.println("Obeso");
		}else {
			System.out.println("Muito obeso");
		}
		System.out.println("Seu IMC é:"+imc);
			
	}

}
