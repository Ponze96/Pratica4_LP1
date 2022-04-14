package Questao1;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int soma=0, aux;

		int[] notas = new int [10];
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
				System.out.println("Digite a nota posicao n°"+ (i+1));
	   			notas[i] = entrada.nextInt();
	   			soma = soma + notas[i];
		}
			for (int i=0; i<10; i++) { 
				for (int j=0; j<9; j++) {
					if(notas[j] > notas[j+1]) {
						
					}
					{
				aux = notas[j];
	   			notas[j] = notas[j+1];
	   			notas[j+1] = aux;
				}
			}
	}
		
			System.out.println("A media é " + soma/10);
			System.out.println("A maior media é " + notas[9]);
			System.out.println("A 2° maior nota é "+ notas[8]);
			System.out.println("A 3° maior nota é "+ notas[7]);
			System.out.println("A menor nota é "+ notas[0]);
			
	}
}


	   		

		
	
	

