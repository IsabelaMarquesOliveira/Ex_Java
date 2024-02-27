package aula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		int valor1=0;
		int valor2=0;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Digite valor 1");
		valor1 = sc.nextInt();
		
		System.out.println("Digite valor 2");
		valor2 = sc.nextInt();
		
		int resultado = (valor1/valor2);
		
		} catch(InputMismatchException e1){
			System.out.println("Digite somente números");
		}
		  catch(ArithmeticException e2){
			System.out.println("Ocorreu uma divisao por 0");
		}finally{
		  System.out.println("Eu sempre passo aqui");
		}

}
}
