package Questao3;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int opcao, num=0, qtde;
		String item, autor, local, data, descricao;
		int i;
		Cadastro[] cad = new Cadastro[10];
				
		
		
		do {
			
			System.out.println("(1) Cadastrar Item Perdido\n(2) Buscar Item\n(3) Sair");
			opcao = entrada.nextInt();
			
			
			switch(opcao)
		{
			case 1:				
					System.out.println("Item: ");
					item = entrada.nextLine();
					entrada.nextLine();
					System.out.println("Autor: ");
					autor = entrada.nextLine();
					System.out.println("Local: ");
					local = entrada.nextLine();
					System.out.println("Data: ");
					data = entrada.nextLine();
					System.out.println("Descrição: ");
					descricao = entrada.nextLine();
					entrada.nextLine();
					cad[num] = new Cadastro(item, autor, descricao, data, local);
					num++;
				
				break;
				
			case 2:
				System.out.println("Informe o item: ");
				item = entrada.next();
				
				for(i = 0; i<10; i++) {
					if(cad[i].equals(item)) {
						System.out.println("Item encontrado");
					}
				}
				break;
				
			case 3:
				System.out.println("Número total de itens cadastrados: " + num);
				break;
				
					
		}
				
		
		} while(opcao != 3);
}
	
}
		

				
				
	


