package aula0403;

public class App1 {

	public static void main(String[] args) {
		
		//arrays
		String nome[] = new String[3];
		nome[0] = "Gabriel";
		nome[1] = "Maria Clara";
		nome[2] = "Eduardo";
		int []valor = {43,3,54,56,6,2};
		//tamanho do vetor
		System.out.println("vetor nome > "+nome.length);
		System.out.println("vetor valor > "+valor.length);
		//imprimindo um valor do vetor
		System.out.println("Nome >> "+nome[1]);
		System.out.println("Valor >> "+valor[3]);

	}

}
