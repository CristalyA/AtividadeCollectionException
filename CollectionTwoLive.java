package Colection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTwoLive {

	public static void main(String[] args) {
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n------------------------------------");
			System.out.println("\n\t\tMenu de opções do estoque: ");
			System.out.println("\n(1) Adicionar produtos no estoque? ");
			System.out.println("\n(2) Remover produtos no estoque? ");
			System.out.println("\n(3) Atualizar produtos no estoque ?");
			System.out.println("\n(4) Mostar todos os produtos do estoque ?");
			System.out.println("\n(0) Encerrrar programa ?");
			System.out.println("\n Qual sua opção ?");
			op = ler.nextInt();
			System.out.println("\n---------------------------------------");
		
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("Qual produto será adicionado ? ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("Qual produto será removido ? ");
				String produto1 = ler.nextLine();
				if(estoque.contains(produto1)){
					estoque.remove(produto1);
				}else {
					System.out.println("\nProduto não existe no estoque!");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("Qual produto de atualização ? ");
				String verifica= ler.nextLine();
				System.out.println("\nQual produto irá susbtituir o "+verifica+"? ");
				String novo= ler.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else{
					System.out.println("\nProduto não existe no estoque !");
				}
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são : ");
				System.out.println(estoque);
				break;
			
			case 0:
				System.out.println("\n Muito obrigada, até a proxima !");
				break;
				default:
					System.out.println("\nOpção inválida !!!\nTente novamente: ");
					
			}
		}
		while(op!=0);

	}

}
