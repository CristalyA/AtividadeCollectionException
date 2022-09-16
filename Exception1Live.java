package Colection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1Live {

	public static int quociente(int numerador,int denominador) throws ArithmeticException{
		return numerador /denominador;
	}
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		boolean continueLoop = true;
		do {
			
			try {
				
				System.out.println("\n Qual o numerador ? ");
				int numerador = ler.nextInt();
				
				System.out.println("\n Qual o denominador ? ");
				int denominador = ler.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
				
				continueLoop = false;
				
			}catch(InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n",inputMismatchException);
				System.err.printf("\nValores validos somente inteiros. Por favor digite novamente : ");
				
			}catch(ArithmeticException arithmeticException) {
				
			System.err.printf("\nExceção: %s\n\n",arithmeticException);
			System.out.println("\nZero é um denominador inválido.Por favor, tente novamente... ");
			
			}
			
		}while(continueLoop);
	}
	


}
